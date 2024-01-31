
/*In Java, @RequiredArgsConstructor and @AllArgsConstructor are annotations provided by the Lombok library to automatically generate constructors for classes.

@AllArgsConstructor generates a constructor that includes all fields of the class as parameters. This is useful when you want a constructor that initializes all fields at once.

Here, Lombok generates a constructor equivalent to public MyClass(int field1, String field2) {...}.

@RequiredArgsConstructor generates a constructor for all final and @NonNull fields. This is useful when you have fields that should be set during object creation and should not be null.

In this case, Lombok generates a constructor equivalent to public MyClass(int field1, String field2) {...}.

Choose the appropriate annotation based on your class requirements and whether you want to include all fields or just final/non-null fields in the constructor.

  */
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyClass {
    private final int field1;
    private final String field2;
}
