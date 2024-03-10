package Glava_2.Task_2_5_6;
public class Alien {
    public static void main(String[] args) {
        AsciiCharSequence result = new AsciiCharSequence(new byte[]{72,69, 76,76,79});
        System.out.println(result.subSequence(0,5));
        System.out.println(result.length());
    }
    public static class AsciiCharSequence implements CharSequence {
        private final byte[] bytes;

        AsciiCharSequence(byte[] bytes) {
            this.bytes = bytes;
        }
        @Override
        public int length() {
            return bytes.length;
        }
        @Override
        public char charAt(int a) {
            return (char) bytes[a];
        }
        @Override
        public AsciiCharSequence subSequence(int start, int end) {
            byte[] array = new byte[end - start];
            for (int i = 0; i < end - start; i++) {
                array[i] = (byte) this.charAt(start + i);
            }
            return new AsciiCharSequence(array);
        }
        @Override
        public String toString() {
            return new String(bytes);
        }
    }
}
