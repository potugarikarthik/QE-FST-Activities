from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-content")
    print(driver.title)
    button = driver.find_element(By.XPATH,"//button[@id='genButton']")
    ActionChains(driver).click(button).perform()
    wait = WebDriverWait(driver,10)
    wait.until(EC.text_to_be_present_in_element((By.XPATH,"//h2[@id='word']"),"release"))
    print(driver.find_element(By.XPATH,"//h2[@id='word']").text)
    driver.quit()
    