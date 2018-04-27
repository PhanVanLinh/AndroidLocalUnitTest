package toong.vn.androidlocalunittest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by PhanVanLinh on 03/05/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class MainPresenterTest {
    MainPresenter mainPresenter = new MainPresenter();

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, mainPresenter.sum(2,2));
    }
}
