from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as dirver:
    dirver.get("https://training-support.net/webelements/login-form/")
    print(dirver.title)
    dirver.find_element(By.XPATH,"//*[@id='username']").send_keys("admin")
    dirver.find_element(By.XPATH,"//*[@id='password']").send_keys("password")
    dirver.find_element(By.XPATH,"/html/body/div/main/div/div/div/div/div[2]/form/button").click()
    dirver.quit()

