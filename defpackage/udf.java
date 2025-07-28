package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: udf  reason: default package */
public final class udf implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ udf(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r3v23, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v68, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r0v36, types: [java.lang.Object, com.google.android.gms.maps.GoogleMapOptions] */
    /* JADX WARNING: type inference failed for: r3v73, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r3v74, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v107, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r46) {
        /*
            r45 = this;
            r0 = r45
            r1 = r46
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x0922;
                case 1: goto L_0x08eb;
                case 2: goto L_0x08bd;
                case 3: goto L_0x088d;
                case 4: goto L_0x0852;
                case 5: goto L_0x07cc;
                case 6: goto L_0x0762;
                case 7: goto L_0x0722;
                case 8: goto L_0x06e2;
                case 9: goto L_0x0678;
                case 10: goto L_0x062f;
                case 11: goto L_0x05de;
                case 12: goto L_0x0599;
                case 13: goto L_0x0570;
                case 14: goto L_0x0542;
                case 15: goto L_0x04f2;
                case 16: goto L_0x04a1;
                case 17: goto L_0x0371;
                case 18: goto L_0x031f;
                case 19: goto L_0x02e7;
                case 20: goto L_0x021a;
                case 21: goto L_0x01f2;
                case 22: goto L_0x01b8;
                case 23: goto L_0x0182;
                case 24: goto L_0x013d;
                case 25: goto L_0x00f2;
                case 26: goto L_0x00ad;
                case 27: goto L_0x0069;
                case 28: goto L_0x004e;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
            r3 = r2
        L_0x0012:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x0045
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x0040
            r8 = 2
            if (r7 == r8) goto L_0x003b
            r8 = 3
            if (r7 == r8) goto L_0x0032
            r8 = 4
            if (r7 == r8) goto L_0x002d
            defpackage.iu7.Y(r1, r6)
            goto L_0x0012
        L_0x002d:
            java.lang.String r3 = defpackage.iu7.n(r1, r6)
            goto L_0x0012
        L_0x0032:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r6, r2)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            goto L_0x0012
        L_0x003b:
            int r5 = defpackage.iu7.T(r1, r6)
            goto L_0x0012
        L_0x0040:
            int r4 = defpackage.iu7.T(r1, r6)
            goto L_0x0012
        L_0x0045:
            defpackage.iu7.r(r1, r0)
            nd3 r0 = new nd3
            r0.<init>(r4, r5, r2, r3)
            return r0
        L_0x004e:
            java.lang.Class<bdc> r0 = defpackage.bdc.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r1.readParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            int r1 = r46.readInt()
            if (r1 == 0) goto L_0x0062
            r1 = 1
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            t0g r2 = new t0g
            r2.<init>(r0, r1)
            return r2
        L_0x0069:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
        L_0x0071:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x0098
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 2
            if (r7 == r8) goto L_0x0093
            r8 = 3
            if (r7 == r8) goto L_0x008e
            r8 = 4
            if (r7 == r8) goto L_0x0089
            defpackage.iu7.Y(r1, r6)
            goto L_0x0071
        L_0x0089:
            java.lang.Float r5 = defpackage.iu7.R(r1, r6)
            goto L_0x0071
        L_0x008e:
            android.os.IBinder r4 = defpackage.iu7.S(r1, r6)
            goto L_0x0071
        L_0x0093:
            int r3 = defpackage.iu7.T(r1, r6)
            goto L_0x0071
        L_0x0098:
            defpackage.iu7.r(r1, r0)
            kw1 r0 = new kw1
            if (r4 != 0) goto L_0x00a0
            goto L_0x00a9
        L_0x00a0:
            un6 r1 = defpackage.ks9.K0(r4)
            lhd r2 = new lhd
            r2.<init>(r1)
        L_0x00a9:
            r0.<init>(r3, r2, r5)
            return r0
        L_0x00ad:
            int r0 = defpackage.iu7.e0(r46)
            r2 = -1
            r4 = 1
            r8 = r2
            r10 = r8
            r6 = r4
            r7 = r6
        L_0x00b8:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x00e8
            int r2 = r46.readInt()
            char r3 = (char) r2
            if (r3 == r4) goto L_0x00e3
            r5 = 2
            if (r3 == r5) goto L_0x00de
            r5 = 3
            if (r3 == r5) goto L_0x00d8
            r5 = 4
            if (r3 == r5) goto L_0x00d2
            defpackage.iu7.Y(r1, r2)
            goto L_0x00b8
        L_0x00d2:
            long r2 = defpackage.iu7.U(r1, r2)
            r10 = r2
            goto L_0x00b8
        L_0x00d8:
            long r2 = defpackage.iu7.U(r1, r2)
            r8 = r2
            goto L_0x00b8
        L_0x00de:
            int r7 = defpackage.iu7.T(r1, r2)
            goto L_0x00b8
        L_0x00e3:
            int r6 = defpackage.iu7.T(r1, r2)
            goto L_0x00b8
        L_0x00e8:
            defpackage.iu7.r(r1, r0)
            h1g r0 = new h1g
            r5 = r0
            r5.<init>(r6, r7, r8, r10)
            return r0
        L_0x00f2:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x00fc:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0133
            int r2 = r46.readInt()
            char r3 = (char) r2
            r9 = 1
            if (r3 == r9) goto L_0x012e
            r9 = 2
            if (r3 == r9) goto L_0x0129
            r9 = 3
            if (r3 == r9) goto L_0x0124
            r9 = 4
            if (r3 == r9) goto L_0x011f
            r9 = 5
            if (r3 == r9) goto L_0x011a
            defpackage.iu7.Y(r1, r2)
            goto L_0x00fc
        L_0x011a:
            int r8 = defpackage.iu7.T(r1, r2)
            goto L_0x00fc
        L_0x011f:
            int r7 = defpackage.iu7.T(r1, r2)
            goto L_0x00fc
        L_0x0124:
            boolean r6 = defpackage.iu7.O(r1, r2)
            goto L_0x00fc
        L_0x0129:
            boolean r5 = defpackage.iu7.O(r1, r2)
            goto L_0x00fc
        L_0x012e:
            int r4 = defpackage.iu7.T(r1, r2)
            goto L_0x00fc
        L_0x0133:
            defpackage.iu7.r(r1, r0)
            ofc r0 = new ofc
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L_0x013d:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0148:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0178
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0173;
                case 2: goto L_0x016e;
                case 3: goto L_0x0169;
                case 4: goto L_0x0164;
                case 5: goto L_0x015f;
                case 6: goto L_0x015a;
                default: goto L_0x0156;
            }
        L_0x0156:
            defpackage.iu7.Y(r1, r2)
            goto L_0x0148
        L_0x015a:
            boolean r9 = defpackage.iu7.O(r1, r2)
            goto L_0x0148
        L_0x015f:
            boolean r8 = defpackage.iu7.O(r1, r2)
            goto L_0x0148
        L_0x0164:
            boolean r7 = defpackage.iu7.O(r1, r2)
            goto L_0x0148
        L_0x0169:
            boolean r6 = defpackage.iu7.O(r1, r2)
            goto L_0x0148
        L_0x016e:
            boolean r5 = defpackage.iu7.O(r1, r2)
            goto L_0x0148
        L_0x0173:
            boolean r4 = defpackage.iu7.O(r1, r2)
            goto L_0x0148
        L_0x0178:
            defpackage.iu7.r(r1, r0)
            rm7 r0 = new rm7
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0182:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = r2
        L_0x0188:
            int r4 = r46.dataPosition()
            if (r4 >= r0) goto L_0x01af
            int r4 = r46.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x01a6
            r6 = 2
            if (r5 == r6) goto L_0x019d
            defpackage.iu7.Y(r1, r4)
            goto L_0x0188
        L_0x019d:
            android.os.Parcelable$Creator<rm7> r3 = defpackage.rm7.CREATOR
            android.os.Parcelable r3 = defpackage.iu7.m(r1, r4, r3)
            rm7 r3 = (defpackage.rm7) r3
            goto L_0x0188
        L_0x01a6:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r2 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r4, r2)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            goto L_0x0188
        L_0x01af:
            defpackage.iu7.r(r1, r0)
            qm7 r0 = new qm7
            r0.<init>(r2, r3)
            return r0
        L_0x01b8:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        L_0x01c0:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x01e9
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x01e2
            r7 = 2
            if (r6 == r7) goto L_0x01dd
            r7 = 3
            if (r6 == r7) goto L_0x01d8
            defpackage.iu7.Y(r1, r5)
            goto L_0x01c0
        L_0x01d8:
            boolean r3 = defpackage.iu7.O(r1, r5)
            goto L_0x01c0
        L_0x01dd:
            boolean r2 = defpackage.iu7.O(r1, r5)
            goto L_0x01c0
        L_0x01e2:
            android.os.Parcelable$Creator<com.google.android.gms.location.LocationRequest> r4 = com.google.android.gms.location.LocationRequest.CREATOR
            java.util.ArrayList r4 = defpackage.iu7.p(r1, r5, r4)
            goto L_0x01c0
        L_0x01e9:
            defpackage.iu7.r(r1, r0)
            pm7 r0 = new pm7
            r0.<init>(r4, r2, r3)
            return r0
        L_0x01f2:
            int r0 = defpackage.iu7.e0(r46)
            java.util.List r2 = com.google.android.gms.location.LocationResult.b
        L_0x01f8:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x0211
            int r3 = r46.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x020a
            defpackage.iu7.Y(r1, r3)
            goto L_0x01f8
        L_0x020a:
            android.os.Parcelable$Creator r2 = android.location.Location.CREATOR
            java.util.ArrayList r2 = defpackage.iu7.p(r1, r3, r2)
            goto L_0x01f8
        L_0x0211:
            defpackage.iu7.r(r1, r0)
            com.google.android.gms.location.LocationResult r0 = new com.google.android.gms.location.LocationResult
            r0.<init>(r2)
            return r0
        L_0x021a:
            int r0 = defpackage.iu7.e0(r46)
            android.os.WorkSource r2 = new android.os.WorkSource
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = -1
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r13 = 600000(0x927c0, double:2.964394E-318)
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            r17 = 102(0x66, float:1.43E-43)
            r38 = r2
            r39 = r3
            r32 = r4
            r35 = r32
            r36 = r35
            r37 = r36
            r33 = r5
            r31 = r7
            r30 = r8
            r26 = r9
            r28 = r26
            r24 = r11
            r22 = r13
            r20 = r15
            r19 = r17
        L_0x0258:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x02dc
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x02d4;
                case 2: goto L_0x02cd;
                case 3: goto L_0x02c6;
                case 4: goto L_0x0266;
                case 5: goto L_0x02bf;
                case 6: goto L_0x02b8;
                case 7: goto L_0x02b1;
                case 8: goto L_0x02aa;
                case 9: goto L_0x02a3;
                case 10: goto L_0x029c;
                case 11: goto L_0x0295;
                case 12: goto L_0x028e;
                case 13: goto L_0x0287;
                case 14: goto L_0x0266;
                case 15: goto L_0x0280;
                case 16: goto L_0x0275;
                case 17: goto L_0x026a;
                default: goto L_0x0266;
            }
        L_0x0266:
            defpackage.iu7.Y(r1, r2)
            goto L_0x0258
        L_0x026a:
            android.os.Parcelable$Creator<a3g> r3 = defpackage.a3g.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r2, r3)
            a3g r2 = (defpackage.a3g) r2
            r39 = r2
            goto L_0x0258
        L_0x0275:
            android.os.Parcelable$Creator r3 = android.os.WorkSource.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r2, r3)
            android.os.WorkSource r2 = (android.os.WorkSource) r2
            r38 = r2
            goto L_0x0258
        L_0x0280:
            boolean r2 = defpackage.iu7.O(r1, r2)
            r37 = r2
            goto L_0x0258
        L_0x0287:
            int r2 = defpackage.iu7.T(r1, r2)
            r36 = r2
            goto L_0x0258
        L_0x028e:
            int r2 = defpackage.iu7.T(r1, r2)
            r35 = r2
            goto L_0x0258
        L_0x0295:
            long r2 = defpackage.iu7.U(r1, r2)
            r33 = r2
            goto L_0x0258
        L_0x029c:
            long r2 = defpackage.iu7.U(r1, r2)
            r28 = r2
            goto L_0x0258
        L_0x02a3:
            boolean r2 = defpackage.iu7.O(r1, r2)
            r32 = r2
            goto L_0x0258
        L_0x02aa:
            long r2 = defpackage.iu7.U(r1, r2)
            r24 = r2
            goto L_0x0258
        L_0x02b1:
            float r2 = defpackage.iu7.Q(r1, r2)
            r31 = r2
            goto L_0x0258
        L_0x02b8:
            int r2 = defpackage.iu7.T(r1, r2)
            r30 = r2
            goto L_0x0258
        L_0x02bf:
            long r2 = defpackage.iu7.U(r1, r2)
            r26 = r2
            goto L_0x0258
        L_0x02c6:
            long r2 = defpackage.iu7.U(r1, r2)
            r22 = r2
            goto L_0x0258
        L_0x02cd:
            long r2 = defpackage.iu7.U(r1, r2)
            r20 = r2
            goto L_0x0258
        L_0x02d4:
            int r2 = defpackage.iu7.T(r1, r2)
            r19 = r2
            goto L_0x0258
        L_0x02dc:
            defpackage.iu7.r(r1, r0)
            com.google.android.gms.location.LocationRequest r0 = new com.google.android.gms.location.LocationRequest
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r26, r28, r30, r31, r32, r33, r35, r36, r37, r38, r39)
            return r0
        L_0x02e7:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r4 = 0
        L_0x02ee:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x0316
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 2
            if (r6 == r7) goto L_0x030d
            r7 = 3
            if (r6 == r7) goto L_0x0303
            defpackage.iu7.Y(r1, r5)
            goto L_0x02ee
        L_0x0303:
            r2 = 8
            defpackage.iu7.g0(r1, r5, r2)
            double r2 = r46.readDouble()
            goto L_0x02ee
        L_0x030d:
            android.os.Parcelable$Creator<s0e> r4 = defpackage.s0e.CREATOR
            android.os.Parcelable r4 = defpackage.iu7.m(r1, r5, r4)
            s0e r4 = (defpackage.s0e) r4
            goto L_0x02ee
        L_0x0316:
            defpackage.iu7.r(r1, r0)
            v0e r0 = new v0e
            r0.<init>(r4, r2)
            return r0
        L_0x031f:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r4 = 0
            r10 = r2
            r7 = r3
            r8 = r7
            r9 = r8
            r6 = r4
        L_0x032b:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0367
            int r2 = r46.readInt()
            char r3 = (char) r2
            r4 = 2
            if (r3 == r4) goto L_0x0362
            r4 = 3
            if (r3 == r4) goto L_0x035d
            r4 = 4
            if (r3 == r4) goto L_0x0358
            r4 = 5
            if (r3 == r4) goto L_0x0353
            r4 = 6
            if (r3 == r4) goto L_0x0349
            defpackage.iu7.Y(r1, r2)
            goto L_0x032b
        L_0x0349:
            android.os.Parcelable$Creator<ood> r3 = defpackage.ood.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r2, r3)
            r10 = r2
            ood r10 = (defpackage.ood) r10
            goto L_0x032b
        L_0x0353:
            boolean r9 = defpackage.iu7.O(r1, r2)
            goto L_0x032b
        L_0x0358:
            int r8 = defpackage.iu7.T(r1, r2)
            goto L_0x032b
        L_0x035d:
            int r7 = defpackage.iu7.T(r1, r2)
            goto L_0x032b
        L_0x0362:
            float r6 = defpackage.iu7.Q(r1, r2)
            goto L_0x032b
        L_0x0367:
            defpackage.iu7.r(r1, r0)
            s0e r0 = new s0e
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
        L_0x0371:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r5 = r2
            r6 = -1
            r7 = -1
            r8 = 0
            r9 = -1
            r10 = -1
            r11 = -1
            r12 = -1
            r13 = -1
            r14 = -1
            r15 = -1
            r16 = -1
            r17 = -1
            r18 = -1
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
        L_0x0391:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x0428
            int r3 = r46.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 2: goto L_0x0422;
                case 3: goto L_0x041c;
                case 4: goto L_0x0416;
                case 5: goto L_0x040b;
                case 6: goto L_0x0406;
                case 7: goto L_0x0401;
                case 8: goto L_0x03fc;
                case 9: goto L_0x03f7;
                case 10: goto L_0x03f2;
                case 11: goto L_0x03ed;
                case 12: goto L_0x03e8;
                case 13: goto L_0x039f;
                case 14: goto L_0x03e3;
                case 15: goto L_0x03de;
                case 16: goto L_0x03d9;
                case 17: goto L_0x03d4;
                case 18: goto L_0x03c9;
                case 19: goto L_0x03c4;
                case 20: goto L_0x03ad;
                case 21: goto L_0x03a8;
                case 22: goto L_0x039f;
                case 23: goto L_0x03a3;
                default: goto L_0x039f;
            }
        L_0x039f:
            defpackage.iu7.Y(r1, r3)
            goto L_0x0391
        L_0x03a3:
            int r5 = defpackage.iu7.T(r1, r3)
            goto L_0x0391
        L_0x03a8:
            java.lang.String r44 = defpackage.iu7.n(r1, r3)
            goto L_0x0391
        L_0x03ad:
            int r3 = defpackage.iu7.V(r1, r3)
            if (r3 != 0) goto L_0x03b6
            r43 = 0
            goto L_0x0391
        L_0x03b6:
            defpackage.iu7.f0(r1, r3)
            int r3 = r46.readInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r43 = r3
            goto L_0x0391
        L_0x03c4:
            byte r18 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x03c9:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLngBounds> r4 = com.google.android.gms.maps.model.LatLngBounds.CREATOR
            android.os.Parcelable r3 = defpackage.iu7.m(r1, r3, r4)
            r42 = r3
            com.google.android.gms.maps.model.LatLngBounds r42 = (com.google.android.gms.maps.model.LatLngBounds) r42
            goto L_0x0391
        L_0x03d4:
            java.lang.Float r41 = defpackage.iu7.R(r1, r3)
            goto L_0x0391
        L_0x03d9:
            java.lang.Float r40 = defpackage.iu7.R(r1, r3)
            goto L_0x0391
        L_0x03de:
            byte r17 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x03e3:
            byte r16 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x03e8:
            byte r15 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x03ed:
            byte r14 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x03f2:
            byte r13 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x03f7:
            byte r12 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x03fc:
            byte r11 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x0401:
            byte r10 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x0406:
            byte r9 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x040b:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.CameraPosition> r4 = com.google.android.gms.maps.model.CameraPosition.CREATOR
            android.os.Parcelable r3 = defpackage.iu7.m(r1, r3, r4)
            r8 = r3
            com.google.android.gms.maps.model.CameraPosition r8 = (com.google.android.gms.maps.model.CameraPosition) r8
            goto L_0x0391
        L_0x0416:
            int r2 = defpackage.iu7.T(r1, r3)
            goto L_0x0391
        L_0x041c:
            byte r7 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x0422:
            byte r6 = defpackage.iu7.P(r1, r3)
            goto L_0x0391
        L_0x0428:
            defpackage.iu7.r(r1, r0)
            com.google.android.gms.maps.GoogleMapOptions r0 = new com.google.android.gms.maps.GoogleMapOptions
            r0.<init>()
            r1 = -1
            r0.c = r1
            r1 = 0
            r0.C0 = r1
            r0.D0 = r1
            r0.E0 = r1
            r0.G0 = r1
            r0.H0 = r1
            java.lang.Boolean r1 = defpackage.jjd.X(r6)
            r0.a = r1
            java.lang.Boolean r1 = defpackage.jjd.X(r7)
            r0.b = r1
            r0.c = r2
            r0.o = r8
            java.lang.Boolean r1 = defpackage.jjd.X(r9)
            r0.X = r1
            java.lang.Boolean r1 = defpackage.jjd.X(r10)
            r0.Y = r1
            java.lang.Boolean r1 = defpackage.jjd.X(r11)
            r0.Z = r1
            java.lang.Boolean r1 = defpackage.jjd.X(r12)
            r0.w0 = r1
            java.lang.Boolean r1 = defpackage.jjd.X(r13)
            r0.x0 = r1
            java.lang.Boolean r1 = defpackage.jjd.X(r14)
            r0.y0 = r1
            java.lang.Boolean r1 = defpackage.jjd.X(r15)
            r0.z0 = r1
            java.lang.Boolean r1 = defpackage.jjd.X(r16)
            r0.A0 = r1
            java.lang.Boolean r1 = defpackage.jjd.X(r17)
            r0.B0 = r1
            r3 = r40
            r0.C0 = r3
            r3 = r41
            r0.D0 = r3
            r3 = r42
            r0.E0 = r3
            java.lang.Boolean r1 = defpackage.jjd.X(r18)
            r0.F0 = r1
            r3 = r43
            r0.G0 = r3
            r3 = r44
            r0.H0 = r3
            r0.I0 = r5
            return r0
        L_0x04a1:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r5 = 1
            r6 = 1000(0x3e8, float:1.401E-42)
            r13 = r2
            r11 = r3
            r9 = r5
            r10 = r9
            r8 = r6
        L_0x04b0:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x04e8
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x04e2;
                case 2: goto L_0x04dc;
                case 3: goto L_0x04d6;
                case 4: goto L_0x04d0;
                case 5: goto L_0x04c6;
                case 6: goto L_0x04c2;
                default: goto L_0x04be;
            }
        L_0x04be:
            defpackage.iu7.Y(r1, r2)
            goto L_0x04b0
        L_0x04c2:
            defpackage.iu7.O(r1, r2)
            goto L_0x04b0
        L_0x04c6:
            android.os.Parcelable$Creator<h1g> r3 = defpackage.h1g.CREATOR
            java.lang.Object[] r2 = defpackage.iu7.o(r1, r2, r3)
            h1g[] r2 = (defpackage.h1g[]) r2
            r13 = r2
            goto L_0x04b0
        L_0x04d0:
            int r2 = defpackage.iu7.T(r1, r2)
            r8 = r2
            goto L_0x04b0
        L_0x04d6:
            long r2 = defpackage.iu7.U(r1, r2)
            r11 = r2
            goto L_0x04b0
        L_0x04dc:
            int r2 = defpackage.iu7.T(r1, r2)
            r10 = r2
            goto L_0x04b0
        L_0x04e2:
            int r2 = defpackage.iu7.T(r1, r2)
            r9 = r2
            goto L_0x04b0
        L_0x04e8:
            defpackage.iu7.r(r1, r0)
            com.google.android.gms.location.LocationAvailability r0 = new com.google.android.gms.location.LocationAvailability
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r13)
            return r0
        L_0x04f2:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = r2
            r9 = r3
            r10 = r9
            r7 = r4
        L_0x0501:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0538
            int r2 = r46.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x0532
            r4 = 2
            if (r3 == r4) goto L_0x052c
            r4 = 3
            if (r3 == r4) goto L_0x0526
            r4 = 5
            if (r3 == r4) goto L_0x051c
            defpackage.iu7.Y(r1, r2)
            goto L_0x0501
        L_0x051c:
            android.os.Parcelable$Creator<a3g> r3 = defpackage.a3g.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r2, r3)
            a3g r2 = (defpackage.a3g) r2
            r11 = r2
            goto L_0x0501
        L_0x0526:
            boolean r2 = defpackage.iu7.O(r1, r2)
            r10 = r2
            goto L_0x0501
        L_0x052c:
            int r2 = defpackage.iu7.T(r1, r2)
            r9 = r2
            goto L_0x0501
        L_0x0532:
            long r2 = defpackage.iu7.U(r1, r2)
            r7 = r2
            goto L_0x0501
        L_0x0538:
            defpackage.iu7.r(r1, r0)
            i97 r0 = new i97
            r6 = r0
            r6.<init>(r7, r9, r10, r11)
            return r0
        L_0x0542:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
        L_0x0548:
            int r4 = r46.dataPosition()
            if (r4 >= r0) goto L_0x0567
            int r4 = r46.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0562
            r6 = 2
            if (r5 == r6) goto L_0x055d
            defpackage.iu7.Y(r1, r4)
            goto L_0x0548
        L_0x055d:
            java.lang.String r2 = defpackage.iu7.n(r1, r4)
            goto L_0x0548
        L_0x0562:
            int r3 = defpackage.iu7.T(r1, r4)
            goto L_0x0548
        L_0x0567:
            defpackage.iu7.r(r1, r0)
            com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
            r0.<init>(r3, r2)
            return r0
        L_0x0570:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
        L_0x0575:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x0590
            int r3 = r46.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0587
            defpackage.iu7.Y(r1, r3)
            goto L_0x0575
        L_0x0587:
            android.os.Parcelable$Creator r2 = android.content.Intent.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r3, r2)
            android.content.Intent r2 = (android.content.Intent) r2
            goto L_0x0575
        L_0x0590:
            defpackage.iu7.r(r1, r0)
            h13 r0 = new h13
            r0.<init>(r2)
            return r0
        L_0x0599:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
            r3 = r4
        L_0x05a2:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x05d5
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 2
            if (r7 == r8) goto L_0x05cc
            r8 = 3
            if (r7 == r8) goto L_0x05c7
            r8 = 4
            if (r7 == r8) goto L_0x05c2
            r8 = 5
            if (r7 == r8) goto L_0x05bd
            defpackage.iu7.Y(r1, r6)
            goto L_0x05a2
        L_0x05bd:
            float r4 = defpackage.iu7.Q(r1, r6)
            goto L_0x05a2
        L_0x05c2:
            float r3 = defpackage.iu7.Q(r1, r6)
            goto L_0x05a2
        L_0x05c7:
            float r2 = defpackage.iu7.Q(r1, r6)
            goto L_0x05a2
        L_0x05cc:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r5 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r5 = defpackage.iu7.m(r1, r6, r5)
            com.google.android.gms.maps.model.LatLng r5 = (com.google.android.gms.maps.model.LatLng) r5
            goto L_0x05a2
        L_0x05d5:
            defpackage.iu7.r(r1, r0)
            com.google.android.gms.maps.model.CameraPosition r0 = new com.google.android.gms.maps.model.CameraPosition
            r0.<init>(r5, r2, r3, r4)
            return r0
        L_0x05de:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r5 = r2
            r8 = r5
            r9 = r8
            r6 = r3
            r7 = r6
        L_0x05e9:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0625
            int r2 = r46.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x0620
            r4 = 2
            if (r3 == r4) goto L_0x061b
            r4 = 3
            if (r3 == r4) goto L_0x0611
            r4 = 4
            if (r3 == r4) goto L_0x060c
            r4 = 5
            if (r3 == r4) goto L_0x0607
            defpackage.iu7.Y(r1, r2)
            goto L_0x05e9
        L_0x0607:
            boolean r9 = defpackage.iu7.O(r1, r2)
            goto L_0x05e9
        L_0x060c:
            boolean r8 = defpackage.iu7.O(r1, r2)
            goto L_0x05e9
        L_0x0611:
            android.os.Parcelable$Creator<nd3> r3 = defpackage.nd3.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r2, r3)
            r7 = r2
            nd3 r7 = (defpackage.nd3) r7
            goto L_0x05e9
        L_0x061b:
            android.os.IBinder r6 = defpackage.iu7.S(r1, r2)
            goto L_0x05e9
        L_0x0620:
            int r5 = defpackage.iu7.T(r1, r2)
            goto L_0x05e9
        L_0x0625:
            defpackage.iu7.r(r1, r0)
            q0g r0 = new q0g
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x062f:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
            r3 = r2
        L_0x0638:
            int r6 = r46.dataPosition()
            if (r6 >= r0) goto L_0x066f
            int r6 = r46.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x066a
            r8 = 2
            if (r7 == r8) goto L_0x0661
            r8 = 3
            if (r7 == r8) goto L_0x065c
            r8 = 4
            if (r7 == r8) goto L_0x0653
            defpackage.iu7.Y(r1, r6)
            goto L_0x0638
        L_0x0653:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r3 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r3 = defpackage.iu7.m(r1, r6, r3)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r3
            goto L_0x0638
        L_0x065c:
            int r5 = defpackage.iu7.T(r1, r6)
            goto L_0x0638
        L_0x0661:
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r6, r2)
            android.accounts.Account r2 = (android.accounts.Account) r2
            goto L_0x0638
        L_0x066a:
            int r4 = defpackage.iu7.T(r1, r6)
            goto L_0x0638
        L_0x066f:
            defpackage.iu7.r(r1, r0)
            p0g r0 = new p0g
            r0.<init>(r4, r2, r5, r3)
            return r0
        L_0x0678:
            int r0 = defpackage.iu7.e0(r46)
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 0
            r18 = r2
            r8 = r3
            r9 = r8
            r10 = r9
            r17 = r10
            r15 = r4
            r16 = r15
            r11 = r5
            r13 = r11
        L_0x068d:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x06d8
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x06d2;
                case 2: goto L_0x06cc;
                case 3: goto L_0x06c6;
                case 4: goto L_0x06c0;
                case 5: goto L_0x06ba;
                case 6: goto L_0x06b4;
                case 7: goto L_0x06ad;
                case 8: goto L_0x06a6;
                case 9: goto L_0x069f;
                default: goto L_0x069b;
            }
        L_0x069b:
            defpackage.iu7.Y(r1, r2)
            goto L_0x068d
        L_0x069f:
            int r2 = defpackage.iu7.T(r1, r2)
            r18 = r2
            goto L_0x068d
        L_0x06a6:
            int r2 = defpackage.iu7.T(r1, r2)
            r17 = r2
            goto L_0x068d
        L_0x06ad:
            java.lang.String r2 = defpackage.iu7.n(r1, r2)
            r16 = r2
            goto L_0x068d
        L_0x06b4:
            java.lang.String r2 = defpackage.iu7.n(r1, r2)
            r15 = r2
            goto L_0x068d
        L_0x06ba:
            long r2 = defpackage.iu7.U(r1, r2)
            r13 = r2
            goto L_0x068d
        L_0x06c0:
            long r2 = defpackage.iu7.U(r1, r2)
            r11 = r2
            goto L_0x068d
        L_0x06c6:
            int r2 = defpackage.iu7.T(r1, r2)
            r10 = r2
            goto L_0x068d
        L_0x06cc:
            int r2 = defpackage.iu7.T(r1, r2)
            r9 = r2
            goto L_0x068d
        L_0x06d2:
            int r2 = defpackage.iu7.T(r1, r2)
            r8 = r2
            goto L_0x068d
        L_0x06d8:
            defpackage.iu7.r(r1, r0)
            t39 r0 = new t39
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r18)
            return r0
        L_0x06e2:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        L_0x06ea:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x0719
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x0714
            r7 = 2
            if (r6 == r7) goto L_0x070b
            r7 = 3
            if (r6 == r7) goto L_0x0702
            defpackage.iu7.Y(r1, r5)
            goto L_0x06ea
        L_0x0702:
            android.os.Parcelable$Creator<q0g> r3 = defpackage.q0g.CREATOR
            android.os.Parcelable r3 = defpackage.iu7.m(r1, r5, r3)
            q0g r3 = (defpackage.q0g) r3
            goto L_0x06ea
        L_0x070b:
            android.os.Parcelable$Creator<nd3> r2 = defpackage.nd3.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r5, r2)
            nd3 r2 = (defpackage.nd3) r2
            goto L_0x06ea
        L_0x0714:
            int r4 = defpackage.iu7.T(r1, r5)
            goto L_0x06ea
        L_0x0719:
            defpackage.iu7.r(r1, r0)
            k0g r0 = new k0g
            r0.<init>(r4, r2, r3)
            return r0
        L_0x0722:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0729:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x0759
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x0743
            r7 = 2
            if (r6 == r7) goto L_0x073e
            defpackage.iu7.Y(r1, r5)
            goto L_0x0729
        L_0x073e:
            java.lang.String r4 = defpackage.iu7.n(r1, r5)
            goto L_0x0729
        L_0x0743:
            int r3 = defpackage.iu7.V(r1, r5)
            int r5 = r46.dataPosition()
            if (r3 != 0) goto L_0x074f
            r3 = r2
            goto L_0x0729
        L_0x074f:
            java.util.ArrayList r6 = r46.createStringArrayList()
            int r5 = r5 + r3
            r1.setDataPosition(r5)
            r3 = r6
            goto L_0x0729
        L_0x0759:
            defpackage.iu7.r(r1, r0)
            f0g r0 = new f0g
            r0.<init>(r4, r3)
            return r0
        L_0x0762:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r6 = r2
            r7 = r6
            r11 = r7
            r12 = r11
            r14 = r12
            r5 = r3
            r8 = r5
            r9 = r8
            r10 = r9
        L_0x0771:
            int r3 = r46.dataPosition()
            if (r3 >= r0) goto L_0x07be
            int r3 = r46.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x07b9;
                case 2: goto L_0x07b2;
                case 3: goto L_0x07a8;
                case 4: goto L_0x07a3;
                case 5: goto L_0x079e;
                case 6: goto L_0x0799;
                case 7: goto L_0x0794;
                case 8: goto L_0x078f;
                case 9: goto L_0x0788;
                case 10: goto L_0x0783;
                default: goto L_0x077f;
            }
        L_0x077f:
            defpackage.iu7.Y(r1, r3)
            goto L_0x0771
        L_0x0783:
            java.lang.String r14 = defpackage.iu7.n(r1, r3)
            goto L_0x0771
        L_0x0788:
            android.os.Parcelable$Creator<ya6> r2 = defpackage.ya6.CREATOR
            java.util.ArrayList r2 = defpackage.iu7.p(r1, r3, r2)
            goto L_0x0771
        L_0x078f:
            java.lang.String r12 = defpackage.iu7.n(r1, r3)
            goto L_0x0771
        L_0x0794:
            java.lang.String r11 = defpackage.iu7.n(r1, r3)
            goto L_0x0771
        L_0x0799:
            boolean r10 = defpackage.iu7.O(r1, r3)
            goto L_0x0771
        L_0x079e:
            boolean r9 = defpackage.iu7.O(r1, r3)
            goto L_0x0771
        L_0x07a3:
            boolean r8 = defpackage.iu7.O(r1, r3)
            goto L_0x0771
        L_0x07a8:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r3 = defpackage.iu7.m(r1, r3, r4)
            r7 = r3
            android.accounts.Account r7 = (android.accounts.Account) r7
            goto L_0x0771
        L_0x07b2:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r4 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r6 = defpackage.iu7.p(r1, r3, r4)
            goto L_0x0771
        L_0x07b9:
            int r5 = defpackage.iu7.T(r1, r3)
            goto L_0x0771
        L_0x07be:
            defpackage.iu7.r(r1, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            java.util.HashMap r13 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.c(r2)
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x07cc:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r5 = 0
            r8 = r2
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r14 = r3
            r7 = r5
        L_0x07e4:
            int r2 = r46.dataPosition()
            if (r2 >= r0) goto L_0x0848
            int r2 = r46.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0842;
                case 2: goto L_0x083c;
                case 3: goto L_0x0836;
                case 4: goto L_0x0830;
                case 5: goto L_0x082a;
                case 6: goto L_0x0820;
                case 7: goto L_0x081a;
                case 8: goto L_0x0814;
                case 9: goto L_0x080d;
                case 10: goto L_0x0804;
                case 11: goto L_0x07fd;
                case 12: goto L_0x07f6;
                default: goto L_0x07f2;
            }
        L_0x07f2:
            defpackage.iu7.Y(r1, r2)
            goto L_0x07e4
        L_0x07f6:
            java.lang.String r2 = defpackage.iu7.n(r1, r2)
            r19 = r2
            goto L_0x07e4
        L_0x07fd:
            java.lang.String r2 = defpackage.iu7.n(r1, r2)
            r18 = r2
            goto L_0x07e4
        L_0x0804:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r2 = defpackage.iu7.p(r1, r2, r3)
            r17 = r2
            goto L_0x07e4
        L_0x080d:
            java.lang.String r2 = defpackage.iu7.n(r1, r2)
            r16 = r2
            goto L_0x07e4
        L_0x0814:
            long r2 = defpackage.iu7.U(r1, r2)
            r14 = r2
            goto L_0x07e4
        L_0x081a:
            java.lang.String r2 = defpackage.iu7.n(r1, r2)
            r13 = r2
            goto L_0x07e4
        L_0x0820:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r2, r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r12 = r2
            goto L_0x07e4
        L_0x082a:
            java.lang.String r2 = defpackage.iu7.n(r1, r2)
            r11 = r2
            goto L_0x07e4
        L_0x0830:
            java.lang.String r2 = defpackage.iu7.n(r1, r2)
            r10 = r2
            goto L_0x07e4
        L_0x0836:
            java.lang.String r2 = defpackage.iu7.n(r1, r2)
            r9 = r2
            goto L_0x07e4
        L_0x083c:
            java.lang.String r2 = defpackage.iu7.n(r1, r2)
            r8 = r2
            goto L_0x07e4
        L_0x0842:
            int r2 = defpackage.iu7.T(r1, r2)
            r7 = r2
            goto L_0x07e4
        L_0x0848:
            defpackage.iu7.r(r1, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            return r0
        L_0x0852:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r4 = r3
        L_0x0859:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x0884
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x087f
            r7 = 2
            if (r6 == r7) goto L_0x087a
            r7 = 3
            if (r6 == r7) goto L_0x0871
            defpackage.iu7.Y(r1, r5)
            goto L_0x0859
        L_0x0871:
            android.os.Parcelable$Creator r2 = android.content.Intent.CREATOR
            android.os.Parcelable r2 = defpackage.iu7.m(r1, r5, r2)
            android.content.Intent r2 = (android.content.Intent) r2
            goto L_0x0859
        L_0x087a:
            int r4 = defpackage.iu7.T(r1, r5)
            goto L_0x0859
        L_0x087f:
            int r3 = defpackage.iu7.T(r1, r5)
            goto L_0x0859
        L_0x0884:
            defpackage.iu7.r(r1, r0)
            xyf r0 = new xyf
            r0.<init>(r3, r4, r2)
            return r0
        L_0x088d:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
        L_0x0893:
            int r4 = r46.dataPosition()
            if (r4 >= r0) goto L_0x08b4
            int r4 = r46.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x08af
            r6 = 2
            if (r5 == r6) goto L_0x08a8
            defpackage.iu7.Y(r1, r4)
            goto L_0x0893
        L_0x08a8:
            android.os.Parcelable$Creator<t39> r2 = defpackage.t39.CREATOR
            java.util.ArrayList r2 = defpackage.iu7.p(r1, r4, r2)
            goto L_0x0893
        L_0x08af:
            int r3 = defpackage.iu7.T(r1, r4)
            goto L_0x0893
        L_0x08b4:
            defpackage.iu7.r(r1, r0)
            ree r0 = new ree
            r0.<init>(r3, r2)
            return r0
        L_0x08bd:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
        L_0x08c3:
            int r4 = r46.dataPosition()
            if (r4 >= r0) goto L_0x08e2
            int r4 = r46.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x08dd
            r6 = 2
            if (r5 == r6) goto L_0x08d8
            defpackage.iu7.Y(r1, r4)
            goto L_0x08c3
        L_0x08d8:
            java.lang.String r2 = defpackage.iu7.n(r1, r4)
            goto L_0x08c3
        L_0x08dd:
            int r3 = defpackage.iu7.T(r1, r4)
            goto L_0x08c3
        L_0x08e2:
            defpackage.iu7.r(r1, r0)
            b03 r0 = new b03
            r0.<init>(r3, r2)
            return r0
        L_0x08eb:
            int r0 = defpackage.iu7.e0(r46)
            r2 = 0
            r3 = 0
            r4 = r3
        L_0x08f2:
            int r5 = r46.dataPosition()
            if (r5 >= r0) goto L_0x0919
            int r5 = r46.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x0914
            r7 = 2
            if (r6 == r7) goto L_0x090f
            r7 = 3
            if (r6 == r7) goto L_0x090a
            defpackage.iu7.Y(r1, r5)
            goto L_0x08f2
        L_0x090a:
            android.os.Bundle r2 = defpackage.iu7.j(r1, r5)
            goto L_0x08f2
        L_0x090f:
            int r4 = defpackage.iu7.T(r1, r5)
            goto L_0x08f2
        L_0x0914:
            int r3 = defpackage.iu7.T(r1, r5)
            goto L_0x08f2
        L_0x0919:
            defpackage.iu7.r(r1, r0)
            ya6 r0 = new ya6
            r0.<init>(r3, r4, r2)
            return r0
        L_0x0922:
            ydf r0 = new ydf
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udf.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ydf[i];
            case 1:
                return new ya6[i];
            case 2:
                return new b03[i];
            case 3:
                return new ree[i];
            case 4:
                return new xyf[i];
            case 5:
                return new GoogleSignInAccount[i];
            case 6:
                return new GoogleSignInOptions[i];
            case 7:
                return new f0g[i];
            case 8:
                return new k0g[i];
            case 9:
                return new t39[i];
            case 10:
                return new p0g[i];
            case 11:
                return new q0g[i];
            case 12:
                return new CameraPosition[i];
            case 13:
                return new h13[i];
            case 14:
                return new Scope[i];
            case 15:
                return new i97[i];
            case 16:
                return new LocationAvailability[i];
            case 17:
                return new GoogleMapOptions[i];
            case 18:
                return new s0e[i];
            case 19:
                return new v0e[i];
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                return new LocationRequest[i];
            case 21:
                return new LocationResult[i];
            case 22:
                return new pm7[i];
            case 23:
                return new qm7[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new rm7[i];
            case 25:
                return new ofc[i];
            case 26:
                return new h1g[i];
            case 27:
                return new kw1[i];
            case 28:
                return new bdc[i];
            default:
                return new nd3[i];
        }
    }
}
