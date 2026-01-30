from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as dirver:
    dirver.get("https://training-support.net")
    print(dirver.title)
    dirver.find_element(By.LINK_TEXT,"About Us").click()
    print(dirver.title)
    dirver.quit()