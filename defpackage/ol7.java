package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: ol7  reason: default package */
public final class ol7 implements Serializable {
    public final int A0;
    public final boolean B0;
    public final boolean C0;
    public final boolean D0;
    public final boolean E0;
    public final boolean F0;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final boolean w0;
    public final boolean x0;
    public final qjb y0;
    public final boolean z0;

    public ol7(nl7 nl7) {
        this.a = nl7.a;
        this.b = nl7.b;
        this.c = nl7.c;
        this.o = nl7.d;
        this.X = nl7.e;
        this.Y = nl7.f;
        this.Z = nl7.g;
        this.w0 = nl7.h;
        this.x0 = nl7.i;
        this.y0 = nl7.j;
        this.z0 = nl7.k;
        this.A0 = nl7.l;
        this.B0 = nl7.m;
        this.C0 = nl7.n;
        this.D0 = nl7.o;
        this.E0 = nl7.p;
        this.F0 = nl7.q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ol7.class != obj.getClass()) {
            return false;
        }
        ol7 ol7 = (ol7) obj;
        return this.a == ol7.a && this.b == ol7.b && this.c == ol7.c && this.o == ol7.o && this.X == ol7.X && this.Y == ol7.Y && this.Z == ol7.Z && this.w0 == ol7.w0 && this.x0 == ol7.x0 && this.z0 == ol7.z0 && this.A0 == ol7.A0 && this.B0 == ol7.B0 && this.C0 == ol7.C0 && this.D0 == ol7.D0 && this.E0 == ol7.E0 && this.F0 == ol7.F0 && this.y0 == ol7.y0;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.o), Boolean.valueOf(this.X), Boolean.valueOf(this.Y), Boolean.valueOf(this.Z), Boolean.valueOf(this.w0), Boolean.valueOf(this.x0), this.y0, Boolean.valueOf(this.z0), Integer.valueOf(this.A0), Boolean.valueOf(this.B0), Boolean.valueOf(this.C0), Boolean.valueOf(this.D0), Boolean.valueOf(this.E0), Boolean.valueOf(this.F0)});
    }

    public final String toString() {
        return "LocalMediaToolboxViewState{qualityButtonEnable=" + this.a + ", qualityTextVisibility=" + this.b + ", qualityProgressBarVisibility=" + this.c + ", multiSelect=" + this.o + ", videoControlsVisibility=" + this.X + ", videoSeekBarVisibility=" + this.Y + ", cropVisibility=" + this.Z + ", filterVisibility=" + this.w0 + ", editVisibility=" + this.x0 + ", quality=" + this.y0 + ", isNumericCheckButtonEnabled=" + this.z0 + ", numberForNumericCheckButton=" + this.A0 + ", highlightCropButton=" + this.B0 + ", highlightFilterButton=" + this.C0 + ", highlightEditButton=" + this.D0 + ", muteVideo=" + this.E0 + '}';
    }
}
