from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    print(driver.title)
    ActionChains(driver).click(driver.find_element(By.XPATH,"//input[starts-with(@id,'full-name')]")).send_keys("Karthik").perform()
    ActionChains(driver).click(driver.find_element(By.XPATH,"//input[starts-with(@id,'full-name')]/following::input")).send_keys("kapotugari@gmail.com").perform()
    driver.find_element(By.XPATH,"//input[@type='date']").send_keys("2026-04-24")
    driver.find_element(By.XPATH,"//button[contains(text(),'Submit')]/preceding::textarea").send_keys("Huge event")
    driver.find_element(By.XPATH,"//button[contains(text(),'Submit')]").click()
    print(driver.find_element(By.XPATH,"//h3[@id='action-confirmation']").text)
    driver.quit()
