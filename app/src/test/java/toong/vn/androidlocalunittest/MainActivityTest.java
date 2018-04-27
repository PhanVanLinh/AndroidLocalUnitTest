package toong.vn.androidlocalunittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by PhanVanLinh on 03/05/2018.
 * phanvanlinh.94vn@gmail.com
 */
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void addition_isCorrect() throws Exception {
        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);

        assertThat(mainActivity.sum(2,2), equalTo(4));
    }
}
