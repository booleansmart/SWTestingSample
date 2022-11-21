package data;

import net.datafaker.Faker;

/**
 * @author Muhamad Hanif on 20/11/2022
 * @project SwTestingSampleAutomation
 */

public class DataSupplier {
    private static Faker faker = new Faker();
    public static TextBoxData textBoxData = new TextBoxData(faker.name().fullName(), "test@mail.com",
            "incorrect", faker.address().secondaryAddress(), faker.address().fullAddress());

    public static CheckBoxData checkBoxData = new CheckBoxData();

}
