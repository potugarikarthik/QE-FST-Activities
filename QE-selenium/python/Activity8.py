from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/mouse-events")
    print(driver.title)
    cargo_lock_button = driver.find_element(By.XPATH,'//*[@id="stage"]/div[1]/div[1]/div')
    ActionChains(driver).click(cargo_lock_button).perform()
    cargo_to_button = driver.find_element(By.XPATH,'//h1[text()="Cargo.toml"]/parent::div')
    ActionChains(driver).click(cargo_to_button).perform()
    print(driver.find_element(By.ID,"result").text)
    src_button = driver.find_element(By.XPATH,'//h1[text()="src"]/parent::div')
    ActionChains(driver).double_click(src_button).perform()
    target_button = driver.find_element(By.XPATH,'//h1[text()="target"]/parent::div')
    ActionChains(driver).context_click(target_button).perform()
    open_button = driver.find_element(By.XPATH,'//*[@id="menu"]/div/ul/li[1]')
    ActionChains(driver).click(open_button).perform()
    print(driver.find_element(By.ID,"result").text)
    driver.quit()