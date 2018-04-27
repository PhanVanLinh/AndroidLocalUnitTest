package toong.vn.androidlocalunittest;

/**
 * Created by PhanVanLinh on 27/04/2018.
 * phanvanlinh.94vn@gmail.com
 */

class EmailValidator {

    public static boolean isValidEmail(String email) {
        if (email.contains("@")) {
            return true;
        }
        return false;
    }
}
