package register;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("serial")
public class ListRegister implements Register {
	private List<Person> persons = new ArrayList<Person>();

	@Override
	public int getCount() {
		return persons.size();
	}

	@Override
	public Person getPerson(int index) {
		return persons.get(index);
	}

	@Override
	public void addPerson(Person person) {
		persons.add(person);
		Collections.sort(persons);
	}

	@Override
	public Person findPersonByName(String name) {
		// for (int i = 0; i < persons.size(); i++) {
		// if (name.equals(persons.get(i).getName())) {
		// return getPerson(i);
		// }
		// }
		// return null;
		return (Person) persons.stream().filter(s -> s.getName().equals(name)).findFirst().orElse(null);
	}

	@Override
	public Person findPersonByPhoneNumber(String phoneNumber) {
		// for (int i = 0; i < persons.size(); i++) {
		// if (phoneNumber.equals(persons.get(i).getPhoneNumber())) {
		// return getPerson(i);
		// }
		// }
		// return null;
		return (Person) persons.stream().filter(s -> s.getPhoneNumber().equals(phoneNumber)).findFirst().orElse(null);
	}

	@Override
	public void removePerson(Person person) {
		persons.remove(person);

	}

	@Override
	public int getSize() {
		return persons.size();
	}

}
