/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.glkit.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Error codes
 */
@Generated
public final class GLKTextureLoaderError {
    @Generated public static final int FileOrURLNotFound = 0x00000000;
    @Generated public static final int InvalidNSData = 0x00000001;
    @Generated public static final int InvalidCGImage = 0x00000002;
    @Generated public static final int UnknownPathType = 0x00000003;
    @Generated public static final int UnknownFileType = 0x00000004;
    @Generated public static final int PVRAtlasUnsupported = 0x00000005;
    @Generated public static final int CubeMapInvalidNumFiles = 0x00000006;
    @Generated public static final int CompressedTextureUpload = 0x00000007;
    @Generated public static final int UncompressedTextureUpload = 0x00000008;
    @Generated public static final int UnsupportedCubeMapDimensions = 0x00000009;
    @Generated public static final int UnsupportedBitDepth = 0x0000000A;
    @Generated public static final int UnsupportedPVRFormat = 0x0000000B;
    @Generated public static final int DataPreprocessingFailure = 0x0000000C;
    @Generated public static final int MipmapUnsupported = 0x0000000D;
    @Generated public static final int UnsupportedOrientation = 0x0000000E;
    @Generated public static final int ReorientationFailure = 0x0000000F;
    @Generated public static final int AlphaPremultiplicationFailure = 0x00000010;
    @Generated public static final int InvalidEAGLContext = 0x00000011;
    @Generated public static final int IncompatibleFormatSRGB = 0x00000012;
    @Generated public static final int UnsupportedTextureTarget = 0x00000013;

    @Generated
    private GLKTextureLoaderError() {
    }
}
