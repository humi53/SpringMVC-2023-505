const debounce = (cback, timeout = 300) => {
  let timer;
  return (...args) => {
    clearTimeout(timer);
    timer = setTimeout(() => {
      cback(...args);
    }, timeout);
  };
  // 클로저
};
