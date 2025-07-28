package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: apa  reason: default package */
public class apa implements Externalizable {
    public bpa A0 = null;
    public boolean B0;
    public bpa C0 = null;
    public boolean D0;
    public bpa E0 = null;
    public boolean F0;
    public bpa G0 = null;
    public boolean H0;
    public bpa I0 = null;
    public boolean J0;
    public bpa K0 = null;
    public boolean L0;
    public bpa M0 = null;
    public boolean N0;
    public bpa O0 = null;
    public boolean P0;
    public bpa Q0 = null;
    public boolean R0;
    public bpa S0 = null;
    public boolean T0;
    public bpa U0 = null;
    public boolean V0;
    public bpa W0 = null;
    public boolean X;
    public String X0 = BuildConfig.FLAVOR;
    public bpa Y = null;
    public int Y0 = 0;
    public boolean Z;
    public String Z0 = BuildConfig.FLAVOR;
    public boolean a;
    public boolean a1;
    public bpa b = null;
    public String b1 = BuildConfig.FLAVOR;
    public boolean c;
    public boolean c1;
    public String d1 = BuildConfig.FLAVOR;
    public boolean e1;
    public String f1 = BuildConfig.FLAVOR;
    public boolean g1;
    public String h1 = BuildConfig.FLAVOR;
    public boolean i1;
    public String j1 = BuildConfig.FLAVOR;
    public boolean k1 = false;
    public final ArrayList l1 = new ArrayList();
    public final ArrayList m1 = new ArrayList();
    public boolean n1 = false;
    public bpa o = null;
    public boolean o1;
    public String p1 = BuildConfig.FLAVOR;
    public boolean q1 = false;
    public bpa w0 = null;
    public boolean x0;
    public bpa y0 = null;
    public boolean z0;

    public void a(String str) {
        this.X0 = str;
    }

    public void b(String str) {
        this.Z0 = str;
    }

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            bpa bpa = new bpa();
            bpa.readExternal(objectInput);
            this.a = true;
            this.b = bpa;
        }
        if (objectInput.readBoolean()) {
            bpa bpa2 = new bpa();
            bpa2.readExternal(objectInput);
            this.c = true;
            this.o = bpa2;
        }
        if (objectInput.readBoolean()) {
            bpa bpa3 = new bpa();
            bpa3.readExternal(objectInput);
            this.X = true;
            this.Y = bpa3;
        }
        if (objectInput.readBoolean()) {
            bpa bpa4 = new bpa();
            bpa4.readExternal(objectInput);
            this.Z = true;
            this.w0 = bpa4;
        }
        if (objectInput.readBoolean()) {
            bpa bpa5 = new bpa();
            bpa5.readExternal(objectInput);
            this.x0 = true;
            this.y0 = bpa5;
        }
        if (objectInput.readBoolean()) {
            bpa bpa6 = new bpa();
            bpa6.readExternal(objectInput);
            this.z0 = true;
            this.A0 = bpa6;
        }
        if (objectInput.readBoolean()) {
            bpa bpa7 = new bpa();
            bpa7.readExternal(objectInput);
            this.B0 = true;
            this.C0 = bpa7;
        }
        if (objectInput.readBoolean()) {
            bpa bpa8 = new bpa();
            bpa8.readExternal(objectInput);
            this.D0 = true;
            this.E0 = bpa8;
        }
        if (objectInput.readBoolean()) {
            bpa bpa9 = new bpa();
            bpa9.readExternal(objectInput);
            this.F0 = true;
            this.G0 = bpa9;
        }
        if (objectInput.readBoolean()) {
            bpa bpa10 = new bpa();
            bpa10.readExternal(objectInput);
            this.H0 = true;
            this.I0 = bpa10;
        }
        if (objectInput.readBoolean()) {
            bpa bpa11 = new bpa();
            bpa11.readExternal(objectInput);
            this.J0 = true;
            this.K0 = bpa11;
        }
        if (objectInput.readBoolean()) {
            bpa bpa12 = new bpa();
            bpa12.readExternal(objectInput);
            this.L0 = true;
            this.M0 = bpa12;
        }
        if (objectInput.readBoolean()) {
            bpa bpa13 = new bpa();
            bpa13.readExternal(objectInput);
            this.N0 = true;
            this.O0 = bpa13;
        }
        if (objectInput.readBoolean()) {
            bpa bpa14 = new bpa();
            bpa14.readExternal(objectInput);
            this.P0 = true;
            this.Q0 = bpa14;
        }
        if (objectInput.readBoolean()) {
            bpa bpa15 = new bpa();
            bpa15.readExternal(objectInput);
            this.R0 = true;
            this.S0 = bpa15;
        }
        if (objectInput.readBoolean()) {
            bpa bpa16 = new bpa();
            bpa16.readExternal(objectInput);
            this.T0 = true;
            this.U0 = bpa16;
        }
        if (objectInput.readBoolean()) {
            bpa bpa17 = new bpa();
            bpa17.readExternal(objectInput);
            this.V0 = true;
            this.W0 = bpa17;
        }
        a(objectInput.readUTF());
        this.Y0 = objectInput.readInt();
        b(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.a1 = true;
            this.b1 = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.c1 = true;
            this.d1 = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.e1 = true;
            this.f1 = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.g1 = true;
            this.h1 = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.i1 = true;
            this.j1 = readUTF5;
        }
        this.k1 = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            yoa yoa = new yoa();
            yoa.readExternal(objectInput);
            this.l1.add(yoa);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            yoa yoa2 = new yoa();
            yoa2.readExternal(objectInput);
            this.m1.add(yoa2);
        }
        this.n1 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.o1 = true;
            this.p1 = readUTF6;
        }
        this.q1 = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.a);
        if (this.a) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            this.o.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.X);
        if (this.X) {
            this.Y.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            this.w0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x0);
        if (this.x0) {
            this.y0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z0);
        if (this.z0) {
            this.A0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B0);
        if (this.B0) {
            this.C0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D0);
        if (this.D0) {
            this.E0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.F0);
        if (this.F0) {
            this.G0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.H0);
        if (this.H0) {
            this.I0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.J0);
        if (this.J0) {
            this.K0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.L0);
        if (this.L0) {
            this.M0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.N0);
        if (this.N0) {
            this.O0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.P0);
        if (this.P0) {
            this.Q0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.R0);
        if (this.R0) {
            this.S0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.T0);
        if (this.T0) {
            this.U0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.V0);
        if (this.V0) {
            this.W0.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.X0);
        objectOutput.writeInt(this.Y0);
        objectOutput.writeUTF(this.Z0);
        objectOutput.writeBoolean(this.a1);
        if (this.a1) {
            objectOutput.writeUTF(this.b1);
        }
        objectOutput.writeBoolean(this.c1);
        if (this.c1) {
            objectOutput.writeUTF(this.d1);
        }
        objectOutput.writeBoolean(this.e1);
        if (this.e1) {
            objectOutput.writeUTF(this.f1);
        }
        objectOutput.writeBoolean(this.g1);
        if (this.g1) {
            objectOutput.writeUTF(this.h1);
        }
        objectOutput.writeBoolean(this.i1);
        if (this.i1) {
            objectOutput.writeUTF(this.j1);
        }
        objectOutput.writeBoolean(this.k1);
        ArrayList arrayList = this.l1;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((yoa) arrayList.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.m1.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((yoa) this.m1.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.n1);
        objectOutput.writeBoolean(this.o1);
        if (this.o1) {
            objectOutput.writeUTF(this.p1);
        }
        objectOutput.writeBoolean(this.q1);
    }
}
