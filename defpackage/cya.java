package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cya  reason: default package */
public final class cya implements Parcelable {
    public static final Parcelable.Creator<cya> CREATOR = new ch9(26);
    public PlaybackState A0;
    public final long X;
    public final int Y;
    public final CharSequence Z;
    public final int a;
    public final long b;
    public final long c;
    public final float o;
    public final long w0;
    public final AbstractCollection x0;
    public final long y0;
    public final Bundle z0;

    public cya(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List list, long j5, Bundle bundle) {
        AbstractCollection abstractCollection;
        List list2 = list;
        this.a = i;
        this.b = j;
        this.c = j2;
        this.o = f;
        this.X = j3;
        this.Y = i2;
        this.Z = charSequence;
        this.w0 = j4;
        if (list2 == null) {
            po5 po5 = ws6.b;
            abstractCollection = e8c.X;
        } else {
            abstractCollection = new ArrayList(list2);
        }
        this.x0 = abstractCollection;
        this.y0 = j5;
        this.z0 = bundle;
    }

    public static cya a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j = yxa.j(playbackState);
        if (j != null) {
            arrayList = new ArrayList(j.size());
            for (PlaybackState.CustomAction next : j) {
                if (next != null) {
                    PlaybackState.CustomAction customAction = next;
                    Bundle l = yxa.l(customAction);
                    vc8.a(l);
                    bya bya = new bya(yxa.f(customAction), yxa.o(customAction), yxa.m(customAction), l);
                    bya.X = customAction;
                    arrayList.add(bya);
                }
            }
        }
        Bundle a2 = zxa.a(playbackState);
        vc8.a(a2);
        cya cya = new cya(yxa.r(playbackState), yxa.q(playbackState), yxa.i(playbackState), yxa.p(playbackState), yxa.g(playbackState), 0, yxa.k(playbackState), yxa.n(playbackState), arrayList, yxa.h(playbackState), a2);
        cya.A0 = playbackState;
        return cya;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", buffered position=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.o);
        sb.append(", updated=");
        sb.append(this.w0);
        sb.append(", actions=");
        sb.append(this.X);
        sb.append(", error code=");
        sb.append(this.Y);
        sb.append(", error message=");
        sb.append(this.Z);
        sb.append(", custom actions=");
        sb.append(this.x0);
        sb.append(", active item id=");
        return wn6.k(sb, this.y0, "}");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.AbstractCollection, java.util.List] */
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.o);
        parcel.writeLong(this.w0);
        parcel.writeLong(this.c);
        parcel.writeLong(this.X);
        TextUtils.writeToParcel(this.Z, parcel, i);
        parcel.writeTypedList(this.x0);
        parcel.writeLong(this.y0);
        parcel.writeBundle(this.z0);
        parcel.writeInt(this.Y);
    }

    public cya(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.o = parcel.readFloat();
        this.w0 = parcel.readLong();
        this.c = parcel.readLong();
        this.X = parcel.readLong();
        this.Z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(bya.CREATOR);
        if (createTypedArrayList == null) {
            po5 po5 = ws6.b;
            createTypedArrayList = e8c.X;
        }
        this.x0 = createTypedArrayList;
        this.y0 = parcel.readLong();
        this.z0 = parcel.readBundle(vc8.class.getClassLoader());
        this.Y = parcel.readInt();
    }
}
