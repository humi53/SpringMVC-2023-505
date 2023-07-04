document.addEventListener("DOMContentLoaded", () => {
  const main_nav = document.querySelector("nav.main");

  const navClickHandler = (e) => {
    const nav_item = e.target;

    if (nav_item.tagName === "LI") {
      const nav_class = nav_item.className;
      const nav_classList = nav_item.classList;
      let location = `${rootPath}`;
      console.log(nav_class);
      console.log(nav_item.classList.contains("user"));
      console.log(nav_item.classList[1]);
      console.log(nav_class.indexOf("user"));

      if (nav_class === "home") {
        location += `/`;
        // nav_item 에 user 라는 클래스가 있으면
        /*
        class = "user login" 이라면
        /user/login 이라는 location 을만들고
        */
      } else if (nav_classList.contains("user")) {
        location += `/user/${nav_classList[1]}`;
      } else if (nav_class === "admin") {
        location += "/admin";
      }
      console.log(location);
      document.location.href = location;

      //   if (nav_class === "home") {
      //     // document.location.href = `${rootPath}/`;
      //     location += `/`;
      //   } else if (nav_class === "login") {
      //     // document.location.href = `${rootPath}/user/login`;
      //     location += `/user/login`;
      //   } else if (nav_class === "join") {
      //     // document.location.href = `${rootPath}/user/join`;
      //     location += `/user/join`;
      //   } else if (nav_class === "logout") {
      //     // document.location.href = `${rootPath}/user/logout`;
      //     location += `/user/logout`;
      //   } else if (nav_class === "mypage") {
      //     // document.location.href = `${rootPath}/user/mypage`;
      //     location += `/user/mypage`;
      //   } else if (nav_class === "admin") {
      //     // document.location.href = `${rootPath}/admin`;
      //     location += `/admin`;
      //   } else {
      //     location += "/";
      //   }
    }
  };
  main_nav.addEventListener("click", navClickHandler);
});
