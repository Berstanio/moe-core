package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSRayPackedOriginDirection extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSRayPackedOriginDirection() {
        super(MPSRayPackedOriginDirection.class);
    }

    @Generated
    protected MPSRayPackedOriginDirection(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSRayPackedOriginDirection(@ByValue MPSPackedFloat3 origin, @ByValue MPSPackedFloat3 direction) {
        super(MPSRayPackedOriginDirection.class);
        setOrigin(origin);
        setDirection(direction);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native MPSPackedFloat3 origin();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOrigin(@ByValue MPSPackedFloat3 value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native MPSPackedFloat3 direction();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setDirection(@ByValue MPSPackedFloat3 value);
}