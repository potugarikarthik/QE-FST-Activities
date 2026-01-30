import time
from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as dirver:
    dirver.get("https://training-support.net/webelements/dynamic-controls")
    print(dirver.title)
    print(dirver.find_element(By.XPATH,"//input[@id='checkbox']").is_selected())
    dirver.find_element(By.XPATH,"//input[@id='checkbox']").click()
    print(dirver.find_element(By.XPATH,"//input[@id='checkbox']").is_selected())
    dirver.quit()