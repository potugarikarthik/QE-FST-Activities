from selenium import webdriver

with webdriver.Firefox() as dirver:
    dirver.get("https://training-support.net")
    print(dirver.title)
    dirver.quit()