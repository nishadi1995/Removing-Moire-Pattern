package opencv;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.photo.Photo;

public class Denoising {

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        Mat src = Imgcodecs.imread("C:\\Users\\NISHADI\\Desktop\\tutorials_codes_assingments\\Assingments\\3rd yr 1st sem\\grapics\\Q2 - Input data-20190403\\images\\scan1.png");
        Mat dst = new Mat();
        Photo.fastNlMeansDenoisingColored(src, dst, 10, 7, 21);
        HighGui.imshow("Input Image", src);    // Show the input image
        HighGui.imshow("output Image", dst);    // Show the output image
        HighGui.waitKey();

        //Imgcodecs.imwrite("C:/Users/NISHADI/Pictures/denoi.jpg", dst);
        System.out.println("Image Processed");
    }
}
