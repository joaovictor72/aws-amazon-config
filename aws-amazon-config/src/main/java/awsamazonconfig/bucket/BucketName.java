package awsamazonconfig.bucket;

public enum BucketName {

    PROFILE_IMAGE("com.jvictor.aws-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
