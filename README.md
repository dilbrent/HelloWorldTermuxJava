## Found at: 
https://lydericblog.wordpress.com/2017/09/04/straightforward-java-compilation-on-termux/

pkg install ecj dx

nano Hello.java

Code:
```java
public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello world, on termux!");
  }
}
```

Compile:
```
ecj Hello.java
dx --dex --output=Hello.dex Hello.class
dalvikvm -cp Hello.dex Hello
```
Output:
Hello world, on termux!
