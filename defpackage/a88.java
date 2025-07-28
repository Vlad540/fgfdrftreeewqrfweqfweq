package defpackage;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;

/* renamed from: a88  reason: default package */
public final class a88 implements Parcelable {
    public static final Parcelable.Creator<a88> CREATOR = new vf7(11);
    public static final yr c;
    public static final String[] o = {MediaMetadataCompat.METADATA_KEY_TITLE, MediaMetadataCompat.METADATA_KEY_ARTIST, MediaMetadataCompat.METADATA_KEY_ALBUM, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_WRITER, MediaMetadataCompat.METADATA_KEY_AUTHOR, MediaMetadataCompat.METADATA_KEY_COMPOSER};
    public final Bundle a;
    public MediaMetadata b;

    /* JADX WARNING: type inference failed for: r0v0, types: [kgd, yr] */
    static {
        ? kgd = new kgd();
        c = kgd;
        wn6.m(1, kgd, MediaMetadataCompat.METADATA_KEY_TITLE, 1, MediaMetadataCompat.METADATA_KEY_ARTIST);
        wn6.m(0, kgd, MediaMetadataCompat.METADATA_KEY_DURATION, 1, MediaMetadataCompat.METADATA_KEY_ALBUM);
        wn6.m(1, kgd, MediaMetadataCompat.METADATA_KEY_AUTHOR, 1, MediaMetadataCompat.METADATA_KEY_WRITER);
        wn6.m(1, kgd, MediaMetadataCompat.METADATA_KEY_COMPOSER, 1, MediaMetadataCompat.METADATA_KEY_COMPILATION);
        wn6.m(1, kgd, MediaMetadataCompat.METADATA_KEY_DATE, 0, MediaMetadataCompat.METADATA_KEY_YEAR);
        wn6.m(1, kgd, MediaMetadataCompat.METADATA_KEY_GENRE, 0, MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER);
        wn6.m(0, kgd, MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, 0, MediaMetadataCompat.METADATA_KEY_DISC_NUMBER);
        wn6.m(1, kgd, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, 2, MediaMetadataCompat.METADATA_KEY_ART);
        wn6.m(1, kgd, MediaMetadataCompat.METADATA_KEY_ART_URI, 2, MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
        wn6.m(1, kgd, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, 3, MediaMetadataCompat.METADATA_KEY_USER_RATING);
        wn6.m(3, kgd, MediaMetadataCompat.METADATA_KEY_RATING, 1, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        wn6.m(1, kgd, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, 1, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        wn6.m(2, kgd, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, 1, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI);
        wn6.m(1, kgd, MediaMetadataCompat.METADATA_KEY_MEDIA_ID, 0, MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        wn6.m(1, kgd, MediaMetadataCompat.METADATA_KEY_MEDIA_URI, 0, MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT);
        kgd.put(MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, 0);
    }

    public a88(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        vc8.a(bundle2);
    }

    public final long a(String str) {
        return this.a.getLong(str, 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public a88(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(vc8.class.getClassLoader());
        readBundle.getClass();
        this.a = readBundle;
    }
}
