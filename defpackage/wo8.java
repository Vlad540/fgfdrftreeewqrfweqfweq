package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import ru.ok.tamtam.nano.b;

/* renamed from: wo8  reason: default package */
public final class wo8 implements Parcelable {
    public static final Parcelable.Creator<wo8> CREATOR = new vf7(17);
    public final vo8 a;

    public wo8(vo8 vo8) {
        this.a = vo8;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte b = 1;
        vo8 vo8 = this.a;
        parcel.writeByte(vo8 == null ? (byte) 1 : 0);
        if (vo8 != null) {
            parcel.writeLong(vo8.b);
            parcel.writeLong(vo8.c);
            parcel.writeLong(vo8.o);
            parcel.writeLong(vo8.X);
            parcel.writeLong(vo8.Y);
            parcel.writeLong(vo8.Z);
            r1g.H(parcel, vo8.w0);
            parcel.writeLong(vo8.x0);
            parcel.writeInt(vo8.y0.a);
            parcel.writeInt(vo8.z0.a);
            parcel.writeLong(vo8.A0);
            r1g.H(parcel, vo8.B0);
            r1g.H(parcel, vo8.C0);
            byte[] bArr = null;
            jj7 jj7 = vo8.D0;
            byte[] byteArray = jj7 != null ? gr8.toByteArray(b.f(jj7)) : null;
            byte b2 = byteArray != null ? (byte) 1 : 0;
            parcel.writeByte(b2);
            if (b2 != 0) {
                parcel.writeInt(byteArray.length);
                parcel.writeByteArray(byteArray);
            }
            parcel.writeInt(vo8.J0);
            parcel.writeLong(vo8.F0);
            parcel.writeInt(vo8.E0);
            parcel.writeParcelable(new wo8(vo8.G0), 0);
            parcel.writeString(vo8.H0);
            parcel.writeString(vo8.I0);
            parcel.writeByte(vo8.K0 ? (byte) 1 : 0);
            parcel.writeInt(vo8.L0);
            parcel.writeInt(vo8.M0);
            parcel.writeInt(us8.e(vo8.Z0));
            parcel.writeLong(vo8.N0);
            parcel.writeLong(vo8.O0);
            parcel.writeParcelable(new wo8(vo8.P0), 0);
            parcel.writeInt(vo8.Q0);
            parcel.writeLong(vo8.R0);
            parcel.writeInt(vo8.S0);
            parcel.writeInt(vo8.T0);
            parcel.writeLong(vo8.U0);
            List list = vo8.V0;
            if (list != null) {
                bArr = gp8.b(list);
            }
            if (bArr == null) {
                b = 0;
            }
            parcel.writeByte(b);
            if (b != 0) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(bArr);
            }
            parcel.writeByte(vo8.n() ? (byte) 1 : 0);
            if (vo8.n()) {
                nd4 nd4 = vo8.X0;
                parcel.writeLong(nd4.a);
                parcel.writeByte(nd4.b ? (byte) 1 : 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e0 A[SYNTHETIC, Splitter:B:21:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wo8(android.os.Parcel r57) {
        /*
            r56 = this;
            r0 = r56
            r1 = r57
            r2 = 1
            r56.<init>()
            boolean r3 = r1g.A(r57)
            if (r3 != 0) goto L_0x0176
            long r6 = r57.readLong()
            long r8 = r57.readLong()
            long r12 = r57.readLong()
            long r14 = r57.readLong()
            long r16 = r57.readLong()
            long r18 = r57.readLong()
            java.lang.String r20 = r1g.B(r57)
            long r10 = r57.readLong()
            int r3 = r57.readInt()
            int r5 = r57.readInt()
            long r23 = r57.readLong()
            java.lang.String r25 = r1g.B(r57)
            java.lang.String r26 = r1g.B(r57)
            byte r4 = r57.readByte()
            if (r4 != r2) goto L_0x0052
            int r4 = r57.readInt()
            byte[] r4 = new byte[r4]
            r1.readByteArray(r4)
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            jj7 r27 = defpackage.fu7.b(r4)
            int r28 = r57.readInt()
            int r29 = r57.readInt()
            long r30 = r57.readLong()
            java.lang.Class<wo8> r4 = defpackage.wo8.class
            java.lang.ClassLoader r2 = r4.getClassLoader()
            android.os.Parcelable r2 = r1.readParcelable(r2)
            wo8 r2 = (defpackage.wo8) r2
            java.lang.String r33 = r57.readString()
            java.lang.String r34 = r57.readString()
            byte r0 = r57.readByte()
            r35 = r14
            r15 = 1
            if (r0 != r15) goto L_0x0082
            r0 = 1
            goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            int r37 = r57.readInt()
            int r39 = r57.readInt()
            int r15 = r57.readInt()
            long r40 = r57.readLong()
            long r44 = r57.readLong()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            android.os.Parcelable r4 = r1.readParcelable(r4)
            wo8 r4 = (defpackage.wo8) r4
            int r46 = r57.readInt()
            long r47 = r57.readLong()
            int r49 = r57.readInt()
            int r50 = r57.readInt()
            long r51 = r57.readLong()
            byte r14 = r57.readByte()
            r42 = r0
            r0 = 1
            if (r14 != r0) goto L_0x00c8
            int r0 = r57.readInt()
            byte[] r0 = new byte[r0]
            r1.readByteArray(r0)
            goto L_0x00c9
        L_0x00c8:
            r0 = 0
        L_0x00c9:
            if (r0 == 0) goto L_0x00d8
            ru.ok.tamtam.nano.Protos$MessageElements r14 = new ru.ok.tamtam.nano.Protos$MessageElements     // Catch:{ Exception -> 0x00d8 }
            r14.<init>()     // Catch:{ Exception -> 0x00d8 }
            gr8.mergeFrom(r14, r0)     // Catch:{ Exception -> 0x00d8 }
            java.util.ArrayList r0 = defpackage.gp8.a(r14)     // Catch:{ Exception -> 0x00d8 }
            goto L_0x00d9
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            byte r14 = r57.readByte()
            r1 = 1
            if (r14 != r1) goto L_0x00fe
            nd4 r14 = new nd4     // Catch:{ Exception -> 0x00fe }
            r38 = r2
            long r1 = r57.readLong()     // Catch:{ Exception -> 0x00fb }
            r53 = r0
            byte r0 = r57.readByte()     // Catch:{ Exception -> 0x0102 }
            r54 = r12
            r12 = 1
            if (r0 != r12) goto L_0x00f5
            r0 = 1
            goto L_0x00f6
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            r14.<init>(r1, r0)     // Catch:{ Exception -> 0x0104 }
            r0 = r14
            goto L_0x0105
        L_0x00fb:
            r53 = r0
            goto L_0x0102
        L_0x00fe:
            r53 = r0
            r38 = r2
        L_0x0102:
            r54 = r12
        L_0x0104:
            r0 = 0
        L_0x0105:
            yr8 r1 = new yr8
            java.util.List r2 = java.util.Collections.emptyList()
            r12 = 0
            r13 = 0
            r1.<init>(r2, r13, r12)
            vo8 r2 = new vo8
            s59 r12 = defpackage.bp8.b
            r12.getClass()
            bp8 r21 = defpackage.s59.t(r3)
            ls8[] r3 = defpackage.ls8.values()
            int r12 = r3.length
            r14 = r13
        L_0x0121:
            if (r14 >= r12) goto L_0x016e
            r13 = r3[r14]
            r57 = r3
            int r3 = r13.a
            if (r3 != r5) goto L_0x0163
            r3 = r38
            vo8 r3 = r3.a
            r32 = r3
            int r38 = defpackage.us8.a(r15)
            vo8 r3 = r4.a
            r43 = r3
            r5 = r2
            r3 = r13
            r12 = r54
            r14 = r35
            r22 = r3
            r35 = r42
            r36 = r37
            r37 = r39
            r39 = r40
            r41 = r44
            r44 = r46
            r45 = r47
            r47 = r49
            r48 = r50
            r49 = r51
            r51 = r53
            r52 = r1
            r53 = r0
            r5.<init>(r6, r8, r10, r12, r14, r16, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r44, r45, r47, r48, r49, r51, r52, r53)
            r13 = r56
            r13.a = r2
            goto L_0x017a
        L_0x0163:
            r13 = r56
            r3 = r38
            r22 = 1
            int r14 = r14 + 1
            r3 = r57
            goto L_0x0121
        L_0x016e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Array contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        L_0x0176:
            r13 = r0
            r0 = 0
            r13.a = r0
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo8.<init>(android.os.Parcel):void");
    }
}
