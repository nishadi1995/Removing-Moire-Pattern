import cv2 as cv
from matplotlib import pyplot as plt
img = cv.imread('scan3.png')
dst	= cv.fastNlMeansDenoisingColored(img,None,10,10,7,21)
plt.subplot(121),plt.imshow(img)
plt.subplot(122),plt.imshow(dst)
plt.show()
cv.imshow('Output Image',dst)
cv.imshow('Original Image',img)
cv.waitKey(0)
cv.destroyAllWindows()

