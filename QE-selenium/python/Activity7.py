from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as dirver:
    dirver.get("https://training-support.net/webelements/dynamic-controls")
    print(dirver.title)
    print(dirver.find_element(By.XPATH,"//input[@id='textInput']").is_enabled())
    dirver.find_element(By.XPATH,"//button[@id='textInputButton']").click()
    print(dirver.find_element(By.XPATH,"//input[@id='textInput']").is_enabled())
    dirver.quit()
    
