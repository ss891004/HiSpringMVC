package s11;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/s11")
public class UserRESTController {
    private List<User> userList = new ArrayList<>();

    {
        userList.add(new User(1, "Spring高手系列"));
        userList.add(new User(2, "SpringMVC系列"));
    }

    @GetMapping("/user/list")
    public List<User> list() {
        System.out.println("list()");
        return userList;
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable("userId") Integer userId) {
        System.out.println("getUser()");
        for (User user : userList) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    @PostMapping(value = "/user", produces = "text/html;charset=UTF-8")
    public String add(User user) {
        System.out.println("add()");
        this.userList.add(user);
        return "新增成功";
    }

    @PutMapping(value = "/user", produces = "text/html;charset=UTF-8")
    public String modify(User user) {
        System.out.println("modify()");
        for (User item : userList) {
            if (item.getUserId().equals(user.getUserId())) {
                item.setName(user.getName());
            }
        }
        return "修改成功";
    }

    @DeleteMapping(value = "/user/{userId}", produces = "text/html;charset=UTF-8")
    public String delete(@PathVariable("userId") Integer userId) {
        System.out.println("delete()");
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getUserId().equals(userId)) {
                iterator.remove();
            }
        }
        return "删除成功";
    }


    public static class User {
        private Integer userId;
        private String name;

        public User() {
        }

        public User(Integer userId, String name) {
            this.userId = userId;
            this.name = name;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userId=" + userId +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
