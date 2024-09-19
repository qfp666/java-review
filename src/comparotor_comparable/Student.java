package comparotor_comparable;

import com.sun.istack.internal.NotNull;

/**
 * Comparable接口是函数式接口  因此可以使用lambda表达式
 */
public class Student implements Comparable<Student>
{
	private Integer age;

	private String name;

	public Student(Integer age, String name)
	{
		this.age = age;
		this.name = name;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public Integer getAge()
	{
		return age;
	}

	@Override
	public String toString()
	{
		return "Student{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}

	@Override
	public int compareTo(@NotNull Student o)
	{
		int age = this.getAge()-o.getAge();
		if(age==0){
			return this.getName().compareTo(o.getName());
		}
		return age;
	}
}
