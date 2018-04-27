package toong.vn.androidlocalunittest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by PhanVanLinh on 27/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class EmailValidatorTest {

    @Test
    public void isValidEmail(){
       assertThat(EmailValidator.isValidEmail("name@email.com"), is(true));
    }
}
