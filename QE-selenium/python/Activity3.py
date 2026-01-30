from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as dirver:
    dirver.get("https://training-support.net/webelements/login-form/")
    print(dirver.title)
    dirver.find_element(By.XPATH,"//input[@id=\"username\"]").send_keys("admin")
    dirver.find_element(By.XPATH,"//input[@id=\"password\"]").send_keys("password")
    dirver.find_element(By.XPATH,"//button[@class='svelte-1pdjkmx']").click()
    dirver.quit()

