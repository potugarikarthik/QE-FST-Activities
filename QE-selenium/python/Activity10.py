from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys



with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/drag-drop")
    print(driver.title)
    ball = driver.find_element(By.XPATH,"//img[@id='ball']")
    dropzone1 = driver.find_element(By.XPATH,"//div[@id='dropzone1']")
    dropzone2 = driver.find_element(By.XPATH,"//div[@id='dropzone2']")
    ActionChains(driver).drag_and_drop(ball, dropzone1).perform()
    if driver.find_element(By.XPATH,"//div[@id='dropzone1']/span").text == "Dropped!":
        print("Dropped in Dropzone-1")
    ActionChains(driver).drag_and_drop(ball, dropzone2).perform()
    if driver.find_element(By.XPATH,"//div[@id='dropzone2']/span").text == "Dropped!":
        print("Dropped in Dropzone-2")
    driver.quit()