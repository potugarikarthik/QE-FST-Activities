from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    checkbox = driver.find_element(By.XPATH,"//input[@id='checkbox']")
    ActionChains(driver).click(driver.find_element(By.XPATH,"//button[contains(text(),'Toggle Checkbox')]")).perform()
    wait = WebDriverWait(driver,10)
    wait.until(EC.invisibility_of_element_located((By.XPATH,"//input[@id='checkbox']")))
    print("Waited Until the checkbox is dissappeared")
    ActionChains(driver).click(driver.find_element(By.XPATH,"//button[contains(text(),'Toggle Checkbox')]")).perform()
    wait.until(EC.visibility_of_element_located((By.XPATH,"//input[@id='checkbox']")))
    print("Waited Until the checkbox is appeared")
    driver.quit()