class UserN {
    private String fullName;

    public UserN(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

@FunctionalInterface
interface UserProcessor {
    String process(UserN u);
}

class UserUtils {
    public static String convertToUpperCase(UserN u) {
        return u.getFullName().toUpperCase();
    }
}

public class XuatSac2 {
    public static void main(String[] args) {
        UserN user = new UserN("son");
        UserProcessor userProcessor = UserUtils::convertToUpperCase;
        System.out.println(userProcessor.process(user));
    }
}