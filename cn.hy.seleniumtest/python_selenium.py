import time
from selenium import webdriver

a =webdriver.Firefox()#运行驱动
a.maximize_window()#打开浏览器

a.get("http://www.baidu.com")#输入请求地址
time.sleep(5)
a.find_element_by_id("kw").send_keys("selenium")#获取到输入框  并输入字符
time.sleep(5)
a.find_element_by_id("su").click()#获取到搜索按钮，并点击
time.sleep(5)
a.quit()#退出浏览器