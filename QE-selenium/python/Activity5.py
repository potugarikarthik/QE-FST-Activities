import time
from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as dirver:
    dirver.get("https://training-support.net/webelements/dynamic-controls")
    print(dirver.title)
    print(dirver.find_element(By.XPATH,"//input[@id='checkbox']").is_displayed())
    dirver.find_element(By.XPATH,"//button[contains(text(),'Toggle Checkbox')]").click()
    time.sleep(5)
    print(dirver.find_element(By.XPATH,"//input[@id='checkbox']").is_displayed())
    dirver.quit()