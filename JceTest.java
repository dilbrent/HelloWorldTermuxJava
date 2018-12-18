import javax.crypto.Cipher;

class JceTest {
  public static void main(String[] args) {
    try {
      int maxKeyLen = Cipher.getMaxAllowedKeyLength("AES");
      System.out.println("maxKeyLen="+maxKeyLen);
      if(maxKeyLen == 2147483647) {
        System.out.println("JCE unlimited strength activated.");
      } else {
        System.out.println("JCE unlimited strength NOT activated!");
      }
    } catch (Exception e){
      System.out.println("Exception: "+e);
    }
  }
}

