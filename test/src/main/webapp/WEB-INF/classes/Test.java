class Test {
  public static void main(String args[]) {
    String[] mp3Args = {"--preset","standard",
            "-q","0",
            "-m","s",
            "OliBarBarFireAse.wav",
            "out.mp3"};
    mp3.Main m = new mp3.Main();
    try
    {
        //m.run(mp3Args);
		m.run(new String[] {"a"});
    }
    catch(Exception e)
    {
        System.out.println("ERROR processing MP3 " + e);// Some bug in Android seems to cause error BufferedOutputSteam is Closed. But it still seems to work OK.
    }  
  }
}