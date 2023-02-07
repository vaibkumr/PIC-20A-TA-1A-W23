/*
  The JAVA Math class is created by declaring
   - a private default constructor;
   - many static final fields;
   - many static methods.

  Here's a random class that I wrote quickly
  for demonstrational purposes.
*/

class Audio {
    // This ensures that one
    // cannot instantiate Audio.
    private Audio() {}


    public static final int SECONDS_PER_MINUTE = 60;
    public static final int MINUTES_PER_HOUR   = 60;
    public static final int SECONDS_PER_HOUR   = 60 * 60;

    public static final int BITS_PER_BYTE = 8;


    public static final int SAMPLE_RATE_CD                = 44_100;
    public static final int SAMPLE_RATE_AXE_FX            = 48_000;
    public static final int SAMPLE_RATE_PRODUCTION_FOR_CD = 88_200;
    public static final int SAMPLE_RATE_DVD               = 96_000;

    public static final int BIT_DEPTH_CD  = 16;
    public static final int BIT_DEPTH_DVD = 24;


    public static double samplesPerBeat(double bpm, int sampleRate) {
        return sampleRate * SECONDS_PER_MINUTE / bpm;
    }

    public static int bytesPerSecond(int sampleRate, int bitDepth, boolean stereo) {
        int bytesPerSecondPerChannel = bitDepth * sampleRate / BITS_PER_BYTE;

        if (stereo) {
            return 2 * bytesPerSecondPerChannel;
        }
        return bytesPerSecondPerChannel;
    }
}
