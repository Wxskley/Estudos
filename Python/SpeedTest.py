import speedtest
test = speedtest.Speedtest()

download_speed = test.download()
upload_speed = test.upload()
print("Download speed: ", download_speed)
print("Upload speed: ", upload_speed)