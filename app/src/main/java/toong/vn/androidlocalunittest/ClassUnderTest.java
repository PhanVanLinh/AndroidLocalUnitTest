package toong.vn.androidlocalunittest;

import android.content.Context;

/**
 * Created by PhanVanLinh on 27/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

class ClassUnderTest {
    private Context context;
    public ClassUnderTest(Context mMockContext) {
        this.context = mMockContext;
    }

    public String getHelloWorldString(){
        return context.getString(R.string.hello_world);
    }
}
