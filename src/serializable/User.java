package serializable;

import java.io.Serializable;
import java.util.Date;

/**
 * 需要把数据长久保存下来重新读取因此需要序列护化(通过对象序列化，可以把对象的状态保存为字节数组，并且可以在有需要的时候将这个字节数组通过反序列化的方式再转换成对象）
 */
public class User implements  Serializable
{
		private String name;
		private int age;
		private Date birthday;
		private transient String gender;
		private static final long serialVersionUID = -6849794470754667710L;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Date getBirthday() {
			return birthday;
		}

		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "User{" +
					"name='" + name + '\'' +
					", age=" + age +
					", gender=" + gender +
					", birthday=" + birthday +
					'}';
		}
}
