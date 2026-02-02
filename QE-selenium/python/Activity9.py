from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/keyboard-events")
    print(driver.title)
    text_input = driver.find_element(By.XPATH,"//h1[@class='mt-3 text-center text-4xl font-semibold text-black']")
    ActionChains(driver).click(text_input).send_keys("Karthik").perform()
    print(text_input.text)
    driver.quit()
