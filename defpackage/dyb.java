package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dyb  reason: default package */
public final class dyb implements Parcelable {
    public static final Parcelable.Creator<dyb> CREATOR = new x3b(10);
    public final int a;
    public final float b;
    public Object c;

    public dyb(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static dyb a(Object obj) {
        dyb dyb;
        dyb dyb2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dyb2 = new dyb(ratingStyle, -1.0f);
                        break;
                }
            } else {
                float f = 1.0f;
                switch (ratingStyle) {
                    case 1:
                        if (!rating.hasHeart()) {
                            f = 0.0f;
                        }
                        dyb = new dyb(1, f);
                        break;
                    case 2:
                        if (!rating.isThumbUp()) {
                            f = 0.0f;
                        }
                        dyb = new dyb(2, f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        dyb2 = d(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= 0.0f && percentRating <= 100.0f) {
                            dyb2 = new dyb(6, percentRating);
                            break;
                        }
                    default:
                        return null;
                }
                dyb2 = dyb;
            }
            dyb2.getClass();
            dyb2.c = obj;
        }
        return dyb2;
    }

    public static dyb d(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new dyb(i, f);
    }

    public final float b() {
        int i = this.a;
        if ((i == 3 || i == 4 || i == 5) && c()) {
            return this.b;
        }
        return -1.0f;
    }

    public final boolean c() {
        return this.b >= 0.0f;
    }

    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
