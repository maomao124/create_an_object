/**
 * Project name(项目名称)：创建对象 create_an_object
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/5
 * Time(创建时间)： 14:35
 * Version(版本): 1.0
 * Description(描述)：
 * 1. 使用 new 关键字创建对象
 * 这是常用的创建对象的方法，语法格式如下：
 * 类名 对象名 = new 类名()；
 * <p>
 * 2. 调用 java.lang.Class 或者 java.lang.reflect.Constuctor 类的 newlnstance() 实例方法
 * 在 Java 中，可以使用 java.lang.Class 或者 java.lang.reflect.Constuctor 类的 newlnstance() 实例方法来创建对象，代码格式如下：
 * java.lang.Class Class 类对象名称 = java.lang.Class.forName(要实例化的类全称);
 * 类名 对象名 = (类名)Class类对象名称.newInstance();
 * 调用 java.lang.Class 类中的 forName() 方法时，需要将要实例化的类的全称（比如 com.mxl.package.Student）作为参数传递过去，
 * 然后再调用 java.lang.Class 类对象的 newInstance() 方法创建对象。
 * <p>
 * 3. 调用对象的 clone() 方法
 * 该方法不常用，使用该方法创建对象时，要实例化的类必须继承 java.lang.Cloneable 接口。 调用对象的 clone() 方法创建对象的语法格式如下：
 * 纯文本复制
 * 类名对象名 = (类名)已创建好的类对象名.clone();
 * <p>
 * 4. 调用 java.io.ObjectlnputStream 对象的 readObject() 方法
 */

public class Student implements Cloneable
{
    // 实现 Cloneable 接口
    private String Name;    // 学生名字
    private int age;    // 学生年龄

    public Student(String name, int age)
    {
        // 构造方法
        this.Name = name;
        this.age = age;
    }

    public Student()
    {
        this.Name = "name";
        this.age = 0;
    }

    public String toString()
    {
        return "学生名字：" + Name + "，年龄：" + age;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println("---------使用 new 关键字创建对象---------");

        // 使用new关键字创建对象
        Student student1 = new Student("小刘", 22);
        System.out.println(student1);
        System.out.println("-----------调用 java.lang.Class 的 newInstance() 方法创建对象-----------");

        // 调用 java.lang.Class 的 newInstance() 方法创建对象
        Class c1 = Class.forName("Student");
        Student student2 = (Student) c1.newInstance();
        System.out.println(student2);
        System.out.println("-------------------调用对象的 clone() 方法创建对象----------");
        // 调用对象的 clone() 方法创建对象
        Student student3 = (Student) student2.clone();
        System.out.println(student3);
    }
}