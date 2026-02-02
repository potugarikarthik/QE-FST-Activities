from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import Select

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print(driver.title)
    dropdown = Select(driver.find_element(By.TAG_NAME,"select"))
    dropdown.select_by_visible_text("Two")
    dropdown.select_by_index(3)
    dropdown.select_by_value("four")
    optionss = dropdown.options
    for opt in optionss:
        print(opt.text)
    driver.quit()
