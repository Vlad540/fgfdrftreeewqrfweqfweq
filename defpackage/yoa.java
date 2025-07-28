package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: yoa  reason: default package */
public final class yoa implements Externalizable {
    public String X = BuildConfig.FLAVOR;
    public boolean Y = false;
    public boolean Z;
    public String a = BuildConfig.FLAVOR;
    public String b = BuildConfig.FLAVOR;
    public final ArrayList c = new ArrayList();
    public boolean o;
    public String w0 = BuildConfig.FLAVOR;

    public final void readExternal(ObjectInput objectInput) {
        this.a = objectInput.readUTF();
        this.b = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.o = true;
            this.X = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.Z = true;
            this.w0 = readUTF2;
        }
        this.Y = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a);
        objectOutput.writeUTF(this.b);
        int size = this.c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) this.c.get(i));
        }
        objectOutput.writeBoolean(this.o);
        if (this.o) {
            objectOutput.writeUTF(this.X);
        }
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            objectOutput.writeUTF(this.w0);
        }
        objectOutput.writeBoolean(this.Y);
    }
}
