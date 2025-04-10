package com.dreammaster.scripts;

import java.util.Arrays;
import java.util.List;

import gregtech.api.enums.GTValues;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTModHandler;
import gregtech.api.util.GTOreDictUnificator;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import static gregtech.api.enums.Mods.AE2FluidCraft;
import static gregtech.api.enums.Mods.AE2Stuff;
import static gregtech.api.enums.Mods.AE2WCT;
import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.Automagy;
import static gregtech.api.enums.Mods.EnderIO;
import static gregtech.api.enums.Mods.EnderStorage;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.IronChests;
import static gregtech.api.enums.Mods.IronTanks;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.recipe.RecipeMaps.alloySmelterRecipes;
import static gregtech.api.recipe.RecipeMaps.assemblerRecipes;
import static gregtech.api.recipe.RecipeMaps.chemicalReactorRecipes;
import static gregtech.api.recipe.RecipeMaps.wiremillRecipes;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static gregtech.api.util.GTRecipeBuilder.TICKS;

public class ScriptZGTNHNomi implements IScriptLoader {
    @Override
    public String getScriptName() {
        return "ZGTNHNomi";
    }

    @Override
    public List<String> getDependencies() {
        return Arrays.asList(
                AE2FluidCraft.ID,
                AE2Stuff.ID,
                AE2WCT.ID,
                AppliedEnergistics2.ID,
                Automagy.ID,
                EnderIO.ID,
                EnderStorage.ID,
                IndustrialCraft2.ID,
                IronChests.ID,
                IronTanks.ID);
    }

    @Override
    public void loadRecipes() {
        final ItemStack PROCESSOR_LOGIC = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 22, missing);
        final ItemStack PROCESSOR_CALCULATION = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 23, missing);
        final ItemStack PROCESSOR_ENGINEERING = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 24, missing);
        final String BLOCK_GLASS = "blockGlass";
        final ItemStack BLOCK_QUARTZ_GLASS = getModItem(AppliedEnergistics2.ID, "tile.BlockQuartzGlass", 1, 0, missing);
        final ItemStack PLATE_REDALLOY = GTOreDictUnificator.get(OrePrefixes.plate, Materials.RedAlloy, 1L);
        final String INGOT_IRON = "ingotIron";
        final String LAPIS = "gemLapis";
        final String CERTUS_QUARTZ = "itemCertusQuartz";
        final String NETHER_QUARTZ = "itemNetherQuartz";
        final ItemStack NETHER_QUARTZ_PURE = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 11, missing);
        final String CERTUS_QUARTZ_CHARGED = "crystalChargedCertusQuartz";
        final String CIRCUIT_LV = "circuitBasic";
        final String CIRCUIT_MV = "circuitGood";
        final String CIRCUIT_HV = "circuitAdvanced";
        final String CIRCUIT_EV = "circuitData";
        final ItemStack ITEM_COMPONENT_1 = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 35);
        final ItemStack ITEM_COMPONENT_4 = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 36);
        final ItemStack ITEM_COMPONENT_16 = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 37);
        final ItemStack ITEM_COMPONENT_64 = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 38);
        final ItemStack FLUID_COMPONENT_1 = getModItem(AE2FluidCraft.ID, "fluid_part", 1, 0);
        final ItemStack FLUID_COMPONENT_4 = getModItem(AE2FluidCraft.ID, "fluid_part", 1, 1);
        final ItemStack FLUID_COMPONENT_16 = getModItem(AE2FluidCraft.ID, "fluid_part", 1, 2);
        final ItemStack FLUID_COMPONENT_64 = getModItem(AE2FluidCraft.ID, "fluid_part", 1, 3);

        final ItemStack INSCRIBER = getModItem(AppliedEnergistics2.ID, "tile.BlockInscriber", 1, 0);
        final ItemStack PLATE_SILICON = GTOreDictUnificator.get(OrePrefixes.plate, Materials.Silicon, 1L);
        final ItemStack ELECTRICPISTON_MV = ItemList.Electric_Piston_MV.get(1L);
        final ItemStack FLUIX_CRYSTAL = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 7, missing);
        final ItemStack FLUIX_CRYSTAL_PURE = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 12, missing);
        final ItemStack FLUIX_CRYSTAL_DUST = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 8, missing);
        final ItemStack MACHINE_HULL_MV = ItemList.Hull_MV.get(1L);

        final ItemStack INSCRIBER_ADVANCED = getModItem(AE2Stuff.ID, "Inscriber", 1, 0, missing);
        final ItemStack HOPPER = getModItem(Minecraft.ID, "hopper", 1, 0, missing);

        final ItemStack CARD_BASIC = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 25);
        final ItemStack CARD_ADVANCED = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 28);
        final ItemStack CARD_REDSTONE = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 26);
        final ItemStack CARD_CRAFTING = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 53);
        final ItemStack CARD_CAPACITY = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 27);
        final ItemStack CARD_BIOMETRIC = getModItem(AppliedEnergistics2.ID, "item.ToolBiometricCard", 1, 0);
        final ItemStack CARD_MEMORY = getModItem(AppliedEnergistics2.ID, "item.ToolMemoryCard", 1, 0);
        final ItemStack CARD_ACCELERATION = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 30);
        final ItemStack CARD_PATTERN_CAPACITY = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 54);
        final ItemStack CARD_INVERTER = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 31);
        final ItemStack CARD_FUZZY = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 29);
        final ItemStack CARD_ORE_DICT = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 55);

        final ItemStack PLATE_IRON = GTOreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 1L);
        final ItemStack PLATE_ELECTRICALSTEEL = GTOreDictUnificator.get(OrePrefixes.plate, Materials.ElectricalSteel, 1L);
        final ItemStack FINE_WIRE_COPPER = GTOreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 1L);
        final ItemStack FINE_WIRE_ALUMINIUM = GTOreDictUnificator.get(OrePrefixes.wireFine, Materials.Aluminium, 1L);
        final ItemStack TORCH_REDSTONE = getModItem(Minecraft.ID, "redstone_torch", 1, 0, missing);
        final ItemStack CRAFTING_TABLE = getModItem(Minecraft.ID, "crafting_table", 1, 0, missing);
        final ItemStack SENSOR_HV = ItemList.Sensor_HV.get(1L);
        final ItemStack ME_INTERFACE = getModItem(AppliedEnergistics2.ID, "tile.BlockInterface", 1, 0, missing);
        final ItemStack WOOL = getModItem(Minecraft.ID, "wool", 1, 0, missing);

        final ItemStack CORE_FORMATION = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 43);
        final ItemStack CORE_ANNIHILATION = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 44);
        final ItemStack ME_CHEST = getModItem(AppliedEnergistics2.ID, "tile.BlockChest", 1, 0);
        final ItemStack ME_DRIVE = getModItem(AppliedEnergistics2.ID, "tile.BlockDrive", 1, 0);
        final ItemStack ME_IO_PORT = getModItem(AppliedEnergistics2.ID, "tile.BlockIOPort", 1, 0);
        final ItemStack ENERGY_CELL = getModItem(AppliedEnergistics2.ID, "tile.BlockEnergyCell", 1, 0);
        final ItemStack ENERGY_CELL_DENSE = getModItem(AppliedEnergistics2.ID, "tile.BlockDenseEnergyCell", 1, 0);
        final ItemStack ENERGY_ACCEPTOR = getModItem(AppliedEnergistics2.ID, "tile.BlockEnergyAcceptor", 1, 0);
        final ItemStack CRYSTAL_GROWTH_ACCELERATOR = getModItem(AppliedEnergistics2.ID, "tile.BlockQuartzGrowthAccelerator", 1, 0);
        final ItemStack CHARGER = getModItem(AppliedEnergistics2.ID, "tile.BlockCharger", 1, 0);
        final ItemStack MOLECULAR_ASSEMBLER = getModItem(AppliedEnergistics2.ID, "tile.BlockMolecularAssembler", 1, 0);
        final ItemStack CELL_WORKBENCH = getModItem(AppliedEnergistics2.ID, "tile.BlockCellWorkbench", 1, 0);

        final String BLOCK_STEEL = "blockSteel";
        final ItemStack EMITTER_MV = ItemList.Emitter_MV.get(1L);
        final ItemStack SENSOR_MV = ItemList.Sensor_MV.get(1L);
        final ItemStack PLATE_ALUMINIUM = GTOreDictUnificator.get(OrePrefixes.plate, Materials.Aluminium, 1L);
        final ItemStack ILLUMINATED_PANEL = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 180, missing);
        final ItemStack ME_GLASS_CABLE = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 16, missing);
        final ItemStack CHEST_WOODEN = getModItem(Minecraft.ID, "chest", 1, 0, missing);
        final ItemStack CHEST_GOLD = getModItem(IronChests.ID, "BlockIronChest", 1, 1, missing);
        final ItemStack MACHINE_HULL_LV = ItemList.Hull_LV.get(1L);
        final ItemStack FRAMEGT_DARKSTEEL = GTOreDictUnificator.get(OrePrefixes.frameGt, Materials.DarkSteel, 1L);
        final ItemStack PLATE_CERTUSQUARTZ = GTOreDictUnificator.get(OrePrefixes.plate, Materials.CertusQuartz, 1L);

        final ItemStack FLUID_PATTERN_ENCODER = getModItem(AE2FluidCraft.ID, "fluid_pattern_encoder", 1, 0);
        final ItemStack FLUID_PACKET_DECODER = getModItem(AE2FluidCraft.ID, "fluid_packet_decoder", 1, 0);
        final ItemStack INGREDIENT_BUFFER = getModItem(AE2FluidCraft.ID, "ingredient_buffer", 1, 0);
        final ItemStack INGREDIENT_BUFFER_LARGE = getModItem(AE2FluidCraft.ID, "large_ingredient_buffer", 1, 0);
        final ItemStack FLUID_DISCRETIZER = getModItem(AE2FluidCraft.ID, "fluid_discretizer", 1, 0);

        final ItemStack ASSEMBLINGMACHINE_MV = ItemList.Machine_MV_Assembler.get(1L);
        final ItemStack FLUIDEXTRACTOR_MV = ItemList.Machine_MV_FluidExtractor.get(1L);
        final ItemStack PLATE_LAPIS = GTOreDictUnificator.get(OrePrefixes.plate, Materials.Lapis, 1L);
        final ItemStack BUCKET = getModItem(Minecraft.ID, "bucket", 1, 0, missing);
        final ItemStack SUPERTANK_LV = ItemList.Super_Chest_LV.get(1L);
        final ItemStack SUPERCHEST_LV = ItemList.Super_Tank_LV.get(1L);
        final ItemStack ME_STORAGE_BUS = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 220, missing);
        final ItemStack ELECTRICPUMP_MV = ItemList.Electric_Pump_MV.get(1L);

        final ItemStack ME_EXPORT_BUS = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 260, missing);
        final ItemStack ME_IMPORT_BUS = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 240, missing);

        final ItemStack ROBOTARM_MV = ItemList.Robot_Arm_MV.get(1L);

        final ItemStack ME_EXPORT_BUS_FLUID = getModItem(AE2FluidCraft.ID, "part_fluid_export", 1, 0);
        final ItemStack ME_IMPORT_BUS_FLUID = getModItem(AE2FluidCraft.ID, "part_fluid_import", 1, 0);
        final ItemStack ME_INTERFACE_FLUID = getModItem(AE2FluidCraft.ID, "fluid_interface", 1, 0);
        final ItemStack ME_STORAGE_BUS_FLUID = getModItem(AE2FluidCraft.ID, "part_fluid_storage_bus", 1, 0);

        final ItemStack QUARTZ_FIBER = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 140, missing);

        final ItemStack ME_SMART_CABLE = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 56);
        final ItemStack ME_SMART_CABLE_DENSE = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 76);
        final ItemStack ME_LEVEL_EMITTER = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 280);
        final ItemStack ME_LEVEL_EMITTER_FLUID = getModItem(AE2FluidCraft.ID, "part_fluid_level_emitter", 1, 0);
        final ItemStack ME_STORAGE_MONITOR = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 400);
        final ItemStack ME_STORAGE_MONITOR_FLUID = getModItem(AE2FluidCraft.ID, "part_fluid_storage_monitor", 1, 0);
        final ItemStack ME_TOGGLE_BUS = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 80);
        final ItemStack ME_TOGGLE_BUS_INVERTED = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 100);

        final ItemStack DUST_REDSTONE = GTOreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L);
        final ItemStack DUST_GLOWSTONE = GTOreDictUnificator.get(OrePrefixes.dust, Materials.Glowstone, 1L);
        final ItemStack STICK_STAINLESSSTEEL = GTOreDictUnificator.get(OrePrefixes.stick, Materials.StainlessSteel, 1L);
        final ItemStack LEVER = getModItem(Minecraft.ID, "lever", 1, 0, missing);

        final ItemStack ME_TERMINAL = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 380);
        final ItemStack ME_TERMINAL_FLUID = getModItem(AE2FluidCraft.ID, "part_fluid_terminal", 1, 0);
        final ItemStack ME_TERMINAL_CRAFTING = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 360);
        final ItemStack ME_TERMINAL_INTERFACE = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 480);
        final ItemStack ME_TERMINAL_PATTERN = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 340);
        final ItemStack ME_TERMINAL_PATTERN_FLUID = getModItem(AE2FluidCraft.ID, "part_fluid_pattern_terminal", 1, 0);
        final ItemStack ME_TERMINAL_PROCESSING = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 500);
        final ItemStack ME_TERMINAL_PROCESSING_FLUID = getModItem(AE2FluidCraft.ID, "part_fluid_pattern_terminal_ex", 1, 0);
        final ItemStack ME_TERMINAL_LEVEL = getModItem(AE2FluidCraft.ID, "part_level_terminal", 1, 0);

        final ItemStack BLANK_PATTERN = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 52);
        final ItemStack CRAFTING_UNIT = getModItem(AppliedEnergistics2.ID, "tile.BlockCraftingUnit", 1, 0);

        final ItemStack FINE_WIRE_SILVER = GTOreDictUnificator.get(OrePrefixes.wireFine, Materials.Silver, 1L);
        final ItemStack PLATE_PLASTIC = GTOreDictUnificator.get(OrePrefixes.plate, Materials.Plastic, 1L);
        final ItemStack DUST_CERTUSQUARTZ = GTOreDictUnificator.get(OrePrefixes.dust, Materials.CertusQuartz, 1L);

        final ItemStack CRAFTING_STORAGE_1 = getModItem(AppliedEnergistics2.ID, "tile.BlockCraftingStorage", 1, 0);
        final ItemStack CRAFTING_STORAGE_4 = getModItem(AppliedEnergistics2.ID, "tile.BlockCraftingStorage", 1, 1);
        final ItemStack CRAFTING_STORAGE_16 = getModItem(AppliedEnergistics2.ID, "tile.BlockCraftingStorage", 1, 2);
        final ItemStack CRAFTING_STORAGE_64 = getModItem(AppliedEnergistics2.ID, "tile.BlockCraftingStorage", 1, 3);
        final ItemStack CRAFTING_CO_PROCESSING = getModItem(AppliedEnergistics2.ID, "tile.BlockCraftingUnit", 1, 1);
        final ItemStack CRAFTING_MONITOR = getModItem(AppliedEnergistics2.ID, "tile.BlockCraftingMonitor", 1, 0);
        final ItemStack P2P_TUNNEL = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1, 460);

        final ItemStack STORAGE_HOUSING = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 39);
        final ItemStack VIEW_CELL = getModItem(AppliedEnergistics2.ID, "item.ItemViewCell", 1, 0);
        final ItemStack FLUIX_PEARL = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 9);
        final ItemStack WIRELESS_RECEIVER = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1, 41);
        final ItemStack WIRELESS_ACCESS_POINT = getModItem(AppliedEnergistics2.ID, "tile.BlockWireless", 1, 0);
        final ItemStack INFINITY_BOOSTER_CARD = getModItem(AE2WCT.ID, "infinityBoosterCard", 1, 0);
        final ItemStack WIRELESS_TERMINAL = getModItem(AppliedEnergistics2.ID, "item.ToolWirelessTerminal", 1, 0);
        final ItemStack WIRELESS_TERMINAL_CRAFTING = getModItem(AE2WCT.ID, "wirelessCraftingTerminal", 1, 0);
        final ItemStack PORTABLE_CELL = getModItem(AppliedEnergistics2.ID, "item.ToolPortableCell", 1, 0);
        final ItemStack PORTABLE_CELL_FLUID = getModItem(AE2FluidCraft.ID, "portable_fluid_cell", 1, 0);
        final ItemStack ME_SECURITY_TERMINAL = getModItem(AppliedEnergistics2.ID, "tile.BlockSecurity", 1, 0);
        final ItemStack PATTERN_ENCODER = getModItem(AE2Stuff.ID, "Encoder", 1, 0);
        final ItemStack MATTER_CONDENSER = getModItem(AppliedEnergistics2.ID, "tile.BlockCondenser", 1, 0);
        final ItemStack ME_QUANTUM_RING = getModItem(AppliedEnergistics2.ID, "tile.BlockQuantumRing", 1, 0);

        final ItemStack FINE_WIRE_REDALLOY = GTOreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 1L);
        final ItemStack PLATE_PULSATINGIRON = GTOreDictUnificator.get(OrePrefixes.plate, Materials.PulsatingIron, 1L);
        final ItemStack PLATE_TITANIUM = GTOreDictUnificator.get(OrePrefixes.plate, Materials.Titanium, 1L);
        final ItemStack EMITTER_EV = ItemList.Emitter_EV.get(1L);
        final ItemStack QUANTUM_EYE = ItemList.QuantumEye.get(1L);
        final ItemStack PLATE_STAINLESSSTEEL = GTOreDictUnificator.get(OrePrefixes.plate, Materials.StainlessSteel, 1L);
        final ItemStack MACHINE_HULL_HV = ItemList.Hull_HV.get(1L);
        final ItemStack MACHINE_HULL_EV = ItemList.Hull_EV.get(1L);

        final ItemStack ITEM_FILTER = getModItem(EnderIO.ID, "itemBasicFilterUpgrade", 1, 0);
        final ItemStack YETA_WRENCH = getModItem(EnderIO.ID, "itemYetaWrench", 1, 0);
        final ItemStack BINDER_COMPOSITE = getModItem(EnderIO.ID, "itemMaterial", 1, 2);
        final ItemStack CONDUIT_BINDER = getModItem(EnderIO.ID, "itemMaterial", 1, 1);
        final ItemStack INGOT_PULSATINGIRON = GTOreDictUnificator.get(OrePrefixes.ingot, Materials.PulsatingIron, 1L);
        final ItemStack CONDUIT_ITEM = getModItem(EnderIO.ID, "itemItemConduit", 1, 0);
        final ItemStack CONDUIT_ME = getModItem(EnderIO.ID, "itemMEConduit", 1, 0);
        final ItemStack CONDUIT_FLUID_ENDER = getModItem(EnderIO.ID, "itemLiquidConduit", 1, 2);
        final ItemStack RESERVOIR = getModItem(EnderIO.ID, "blockReservoir", 1, 0);

        final ItemStack PAPER = getModItem(Minecraft.ID, "paper", 1, 0, missing);
        final ItemStack GEARGT_IRON = GTOreDictUnificator.get(OrePrefixes.gearGt, Materials.Iron, 1L);
        final ItemStack GRAVEL = getModItem(Minecraft.ID, "gravel", 1, 0, missing);
        final ItemStack CLAY = getModItem(Minecraft.ID, "clay_ball", 1, 0, missing);
        final String BLOCK_SAND = "sand";
        final ItemStack DUST_MALACHITE = GTOreDictUnificator.get(OrePrefixes.dust, Materials.Malachite, 1L);
        final ItemStack NUGGET_PULSATINGIRON = GTOreDictUnificator.get(OrePrefixes.nugget, Materials.PulsatingIron, 1L);
        final ItemStack CAULDRON = getModItem(Minecraft.ID, "cauldron", 1, 0, missing);

        final ItemStack ENDER_CHEST = getModItem(EnderStorage.ID, "enderChest", 1, 0);
        final ItemStack ENDER_TANK = getModItem(EnderStorage.ID, "enderChest", 1, 4096);

        final String BLOCK_OBSIDIAN = "blockObsidian";
        final ItemStack STICK_COPPER = GTOreDictUnificator.get(OrePrefixes.stick, Materials.Copper, 1L);
        final ItemStack TANK_GOLD = getModItem(IronTanks.ID, "goldTank", 1, 4096, missing);

        final ItemStack ENDER_PEARL = getModItem(Minecraft.ID, "ender_pearl", 1, 0);
        final ItemStack ENDER_EYE = getModItem(Minecraft.ID, "ender_eye", 1, 0);
        final ItemStack NETHER_STAR = getModItem(Minecraft.ID, "nether_star", 1, 0);
        final ItemStack BREWING_STAND = getModItem(Minecraft.ID, "brewing_stand", 1, 0);

        final String GT_WRENCH = "craftingToolWrench";
        final ItemStack DUST_BERYLLIUM = GTOreDictUnificator.get(OrePrefixes.dust, Materials.Beryllium, 1L);
        final ItemStack DUST_POTASSIUM = GTOreDictUnificator.get(OrePrefixes.dust, Materials.Potassium, 1L);
        final FluidStack FLUID_NITROGEN = FluidRegistry.getFluidStack("nitrogen", 1000);
        final ItemStack DUST_SULFUR = GTOreDictUnificator.get(OrePrefixes.dust, Materials.Sulfur, 1L);
        final ItemStack DUST_GOLD = GTOreDictUnificator.get(OrePrefixes.dust, Materials.Gold, 1L);
        final ItemStack GEMFLAWLESS_EMERALD = GTOreDictUnificator.get(OrePrefixes.gemFlawless, Materials.Emerald, 1L);
        final ItemStack SPRING_COPPER = GTOreDictUnificator.get(OrePrefixes.spring, Materials.Copper, 1L);
        final ItemStack COBBLESTONE = getModItem(Minecraft.ID, "cobblestone", 1, 0);

        final ItemStack DENSE_REDCRYSTAL = getModItem(Automagy.ID, "blockRedcrystalDense", 1, 0);
        final ItemStack CROP_SEED = getModItem(IndustrialCraft2.ID, "itemCropSeed", 1, 0);
        ItemStack STICKREED = CROP_SEED.copy();
        NBTTagCompound STICKREED_TAG = new NBTTagCompound();
        STICKREED_TAG.setString("owner", "IC2");
        STICKREED_TAG.setString("name", "stickreed");
        STICKREED_TAG.setByte("scan", (byte)4);
        STICKREED_TAG.setByte("growth", (byte)1);
        STICKREED_TAG.setByte("resistance", (byte)1);
        STICKREED_TAG.setByte("gain", (byte)1);
        STICKREED.setTagCompound(STICKREED_TAG);

        final ItemStack COMPARATOR = getModItem(Minecraft.ID, "comparator", 1, 0);
        final ItemStack SUGAR_CANE = getModItem(Minecraft.ID, "reeds", 1, 0);
        final ItemStack STICKY_RESIN = getModItem(IndustrialCraft2.ID, "itemHarz", 1, 0);

        addShapedRecipe(
                ITEM_COMPONENT_1,
                BLOCK_GLASS, PLATE_REDALLOY, BLOCK_GLASS,
                PLATE_REDALLOY, CIRCUIT_LV, PLATE_REDALLOY,
                BLOCK_GLASS, PLATE_REDALLOY, BLOCK_GLASS);

        addShapedRecipe(
                ITEM_COMPONENT_4,
                BLOCK_GLASS, PROCESSOR_LOGIC, BLOCK_GLASS,
                ITEM_COMPONENT_1, CIRCUIT_MV, ITEM_COMPONENT_1,
                BLOCK_GLASS, ITEM_COMPONENT_1, BLOCK_GLASS);

        addShapedRecipe(
                ITEM_COMPONENT_16,
                BLOCK_GLASS, PROCESSOR_ENGINEERING, BLOCK_GLASS,
                ITEM_COMPONENT_4, CIRCUIT_HV, ITEM_COMPONENT_4,
                BLOCK_GLASS, ITEM_COMPONENT_4, BLOCK_GLASS);

        addShapedRecipe(
                ITEM_COMPONENT_64,
                PROCESSOR_LOGIC, PROCESSOR_ENGINEERING, PROCESSOR_LOGIC,
                ITEM_COMPONENT_16, CIRCUIT_EV, ITEM_COMPONENT_16,
                PROCESSOR_LOGIC, ITEM_COMPONENT_16, PROCESSOR_LOGIC);

        addShapedRecipe(
                FLUID_COMPONENT_1,
                LAPIS, CERTUS_QUARTZ, LAPIS,
                CERTUS_QUARTZ, PROCESSOR_LOGIC, CERTUS_QUARTZ,
                LAPIS, CERTUS_QUARTZ, LAPIS);

        addShapedRecipe(
                FLUID_COMPONENT_4,
                LAPIS, PROCESSOR_CALCULATION, LAPIS,
                FLUID_COMPONENT_1, BLOCK_QUARTZ_GLASS, FLUID_COMPONENT_1,
                LAPIS, FLUID_COMPONENT_1, LAPIS);

        addShapedRecipe(
                FLUID_COMPONENT_16,
                LAPIS, PROCESSOR_CALCULATION, LAPIS,
                FLUID_COMPONENT_4, BLOCK_QUARTZ_GLASS, FLUID_COMPONENT_4,
                LAPIS, FLUID_COMPONENT_4, LAPIS);

        addShapedRecipe(
                FLUID_COMPONENT_64,
                LAPIS, PROCESSOR_CALCULATION, LAPIS,
                FLUID_COMPONENT_16, BLOCK_QUARTZ_GLASS, FLUID_COMPONENT_16,
                LAPIS, FLUID_COMPONENT_16, LAPIS);

        addShapedRecipe(
                INSCRIBER,
                PLATE_SILICON, ELECTRICPISTON_MV, PLATE_SILICON,
                FLUIX_CRYSTAL, MACHINE_HULL_MV, PLATE_SILICON,
                PLATE_SILICON, ELECTRICPISTON_MV, PLATE_SILICON);

        addShapedRecipe(
                INSCRIBER,
                PLATE_SILICON, ELECTRICPISTON_MV, PLATE_SILICON,
                FLUIX_CRYSTAL_PURE, MACHINE_HULL_MV, PLATE_SILICON,
                PLATE_SILICON, ELECTRICPISTON_MV, PLATE_SILICON);

        addShapedRecipe(
                INSCRIBER_ADVANCED,
                INGOT_IRON, HOPPER, INGOT_IRON,
                PROCESSOR_ENGINEERING, INSCRIBER, PROCESSOR_ENGINEERING,
                INGOT_IRON, HOPPER, INGOT_IRON);

        addShapedRecipe(
                CARD_BASIC,
                FINE_WIRE_COPPER, PLATE_IRON, null,
                FINE_WIRE_COPPER, PROCESSOR_CALCULATION, PLATE_IRON,
                FINE_WIRE_COPPER, PLATE_IRON, null);

        addShapedRecipe(
                CARD_ADVANCED,
                FINE_WIRE_ALUMINIUM, PLATE_ELECTRICALSTEEL, null,
                FINE_WIRE_ALUMINIUM, PROCESSOR_CALCULATION, PLATE_ELECTRICALSTEEL,
                FINE_WIRE_ALUMINIUM, PLATE_ELECTRICALSTEEL, null);

        addShapelessRecipe(CARD_REDSTONE, CARD_BASIC, TORCH_REDSTONE);
        addShapelessRecipe(CARD_CRAFTING, CARD_BASIC, CRAFTING_TABLE);
        addShapelessRecipe(CARD_CAPACITY, CARD_BASIC, CERTUS_QUARTZ);
        addShapelessRecipe(CARD_BIOMETRIC, CARD_BASIC, SENSOR_HV);
        addShapelessRecipe(CARD_MEMORY, CARD_BASIC, CIRCUIT_HV);
        addShapelessRecipe(CARD_ACCELERATION, CARD_ADVANCED, FLUIX_CRYSTAL);
        addShapelessRecipe(CARD_ACCELERATION, CARD_ADVANCED, FLUIX_CRYSTAL_PURE);
        addShapelessRecipe(CARD_PATTERN_CAPACITY, CARD_ADVANCED, ME_INTERFACE);
        addShapelessRecipe(CARD_INVERTER, CARD_ADVANCED, TORCH_REDSTONE);
        addShapelessRecipe(CARD_FUZZY, CARD_ADVANCED, WOOL);
        addShapelessRecipe(CARD_ORE_DICT, CARD_ADVANCED, PROCESSOR_ENGINEERING);

        final ItemStack CORE_FORMATION_OUTPUT = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 2, 43);
        addShapedRecipe(
                CORE_FORMATION_OUTPUT,
                null, null, null,
                CERTUS_QUARTZ, FLUIX_CRYSTAL_DUST, PROCESSOR_LOGIC,
                null, null, null);

        final ItemStack CORE_ANNIHILATION_OUTPUT = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 2, 44);
        addShapedRecipe(
                CORE_ANNIHILATION_OUTPUT,
                null, null, null,
                NETHER_QUARTZ, FLUIX_CRYSTAL_DUST, PROCESSOR_LOGIC,
                null, null, null);

        addShapedRecipe(
                ME_CHEST,
                BLOCK_QUARTZ_GLASS, ILLUMINATED_PANEL, BLOCK_QUARTZ_GLASS,
                CERTUS_QUARTZ, CHEST_GOLD, FLUIX_CRYSTAL,
                BLOCK_STEEL, NETHER_QUARTZ, BLOCK_STEEL);
        addShapedRecipe(
                ME_CHEST,
                BLOCK_QUARTZ_GLASS, ILLUMINATED_PANEL, BLOCK_QUARTZ_GLASS,
                CERTUS_QUARTZ, CHEST_GOLD, FLUIX_CRYSTAL_PURE,
                BLOCK_STEEL, NETHER_QUARTZ, BLOCK_STEEL);

        addShapedRecipe(
                ME_DRIVE,
                PLATE_ALUMINIUM, EMITTER_MV, PLATE_ALUMINIUM,
                CIRCUIT_LV, ME_CHEST, CIRCUIT_LV,
                PLATE_ALUMINIUM, SENSOR_MV, PLATE_ALUMINIUM);

        addShapedRecipe(
                ME_IO_PORT,
                BLOCK_GLASS, BLOCK_GLASS, BLOCK_GLASS,
                ME_DRIVE, ME_GLASS_CABLE, ME_DRIVE,
                INGOT_IRON, PROCESSOR_LOGIC, INGOT_IRON);

        addShapedRecipe(
                ENERGY_CELL,
                CERTUS_QUARTZ, FLUIX_CRYSTAL_DUST, CERTUS_QUARTZ,
                FLUIX_CRYSTAL_DUST, BLOCK_QUARTZ_GLASS, FLUIX_CRYSTAL_DUST,
                CERTUS_QUARTZ, FLUIX_CRYSTAL_DUST, CERTUS_QUARTZ);

        addShapedRecipe(
                ENERGY_CELL_DENSE,
                ENERGY_CELL, ENERGY_CELL, ENERGY_CELL,
                ENERGY_CELL, PROCESSOR_CALCULATION, ENERGY_CELL,
                ENERGY_CELL, ENERGY_CELL, ENERGY_CELL);

        addShapedRecipe(
                ENERGY_ACCEPTOR,
                PLATE_ELECTRICALSTEEL, FLUIX_CRYSTAL, PLATE_ELECTRICALSTEEL,
                FLUIX_CRYSTAL, MACHINE_HULL_LV, FLUIX_CRYSTAL,
                PLATE_ELECTRICALSTEEL, FLUIX_CRYSTAL, PLATE_ELECTRICALSTEEL);
        addShapedRecipe(
                ENERGY_ACCEPTOR,
                PLATE_ELECTRICALSTEEL, FLUIX_CRYSTAL_PURE, PLATE_ELECTRICALSTEEL,
                FLUIX_CRYSTAL_PURE, MACHINE_HULL_LV, FLUIX_CRYSTAL_PURE,
                PLATE_ELECTRICALSTEEL, FLUIX_CRYSTAL_PURE, PLATE_ELECTRICALSTEEL);

        addShapedRecipe(
                CRYSTAL_GROWTH_ACCELERATOR,
                FRAMEGT_DARKSTEEL, CERTUS_QUARTZ_CHARGED, FRAMEGT_DARKSTEEL,
                CERTUS_QUARTZ_CHARGED, MACHINE_HULL_LV, CERTUS_QUARTZ_CHARGED,
                FRAMEGT_DARKSTEEL, CERTUS_QUARTZ_CHARGED, FRAMEGT_DARKSTEEL);

        addShapedRecipe(
                CHARGER,
                PLATE_SILICON, PLATE_CERTUSQUARTZ, PLATE_SILICON,
                PLATE_SILICON, null, null,
                PLATE_SILICON, PLATE_CERTUSQUARTZ, PLATE_SILICON);

        addShapedRecipe(
                MOLECULAR_ASSEMBLER,
                PLATE_ALUMINIUM, BLOCK_QUARTZ_GLASS, PLATE_ALUMINIUM,
                CORE_ANNIHILATION, CRAFTING_TABLE, CORE_FORMATION,
                PLATE_ALUMINIUM, BLOCK_QUARTZ_GLASS, PLATE_ALUMINIUM);

        addShapedRecipe(
                CELL_WORKBENCH,
                WOOL, PROCESSOR_CALCULATION, WOOL,
                INGOT_IRON, CHEST_WOODEN, INGOT_IRON,
                INGOT_IRON, INGOT_IRON, INGOT_IRON);

        addShapedRecipe(
                FLUID_PATTERN_ENCODER,
                PLATE_LAPIS, ASSEMBLINGMACHINE_MV, PLATE_LAPIS,
                PLATE_IRON, CELL_WORKBENCH, PLATE_IRON,
                PLATE_IRON, PLATE_IRON, PLATE_IRON);

        addShapedRecipe(
                FLUID_PACKET_DECODER,
                PLATE_IRON, FLUIDEXTRACTOR_MV, PLATE_IRON,
                ME_GLASS_CABLE, CELL_WORKBENCH, ME_GLASS_CABLE,
                PLATE_IRON, PLATE_IRON, PLATE_IRON);

        addShapedRecipe(
                INGREDIENT_BUFFER,
                PLATE_IRON, PROCESSOR_ENGINEERING, PLATE_IRON,
                BUCKET, CELL_WORKBENCH, BUCKET,
                PLATE_IRON, PROCESSOR_CALCULATION, PLATE_IRON);

        addShapedRecipe(
                INGREDIENT_BUFFER_LARGE,
                PLATE_ALUMINIUM, PROCESSOR_ENGINEERING, PLATE_ALUMINIUM,
                SUPERCHEST_LV, INGREDIENT_BUFFER, SUPERTANK_LV,
                PLATE_ALUMINIUM, PROCESSOR_CALCULATION, PLATE_ALUMINIUM);

        addShapedRecipe(
                FLUID_DISCRETIZER,
                PLATE_IRON, BUCKET, PLATE_IRON,
                ME_STORAGE_BUS, ELECTRICPUMP_MV, ME_STORAGE_BUS,
                PLATE_IRON, PROCESSOR_ENGINEERING, PLATE_IRON);

        addShapedRecipe(
                ME_EXPORT_BUS,
                null, null, null,
                null, CORE_FORMATION, null,
                PLATE_ALUMINIUM, ELECTRICPISTON_MV, PLATE_ALUMINIUM);

        addShapedRecipe(
                ME_IMPORT_BUS,
                null, null, null,
                null, CORE_ANNIHILATION, null,
                PLATE_ALUMINIUM, ELECTRICPISTON_MV, PLATE_ALUMINIUM);

        addShapedRecipe(
                ME_INTERFACE,
                PLATE_ALUMINIUM, ROBOTARM_MV, PLATE_ALUMINIUM,
                CORE_FORMATION, MACHINE_HULL_MV, CORE_ANNIHILATION,
                PLATE_ALUMINIUM, PLATE_ALUMINIUM, PLATE_ALUMINIUM);

        addShapelessRecipe(
                ME_STORAGE_BUS,
                ME_INTERFACE, ELECTRICPISTON_MV);

        addShapedRecipe(
                ME_EXPORT_BUS_FLUID,
                null, null, null,
                null, CORE_FORMATION, null,
                PLATE_LAPIS, ELECTRICPUMP_MV, PLATE_LAPIS);

        addShapedRecipe(
                ME_IMPORT_BUS_FLUID,
                null, null, null,
                null, CORE_ANNIHILATION, null,
                PLATE_LAPIS, ELECTRICPUMP_MV, PLATE_LAPIS);

        addShapedRecipe(
                ME_INTERFACE_FLUID,
                PLATE_LAPIS, ELECTRICPUMP_MV, PLATE_LAPIS,
                CORE_FORMATION, MACHINE_HULL_MV, CORE_ANNIHILATION,
                PLATE_LAPIS, PLATE_LAPIS, PLATE_LAPIS);

        addShapelessRecipe(
                ME_STORAGE_BUS_FLUID,
                ME_INTERFACE_FLUID, ELECTRICPUMP_MV);

        final ItemStack QUARTZ_FIBER_OUTPUT = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 2, 140, missing);
        GTValues.RA.stdBuilder()
                .itemInputs(GTOreDictUnificator.get(OrePrefixes.gem, Materials.NetherQuartz, 1))
                .itemOutputs(QUARTZ_FIBER_OUTPUT)
                .duration(5 * SECONDS).eut(16).addTo(wiremillRecipes);
        GTValues.RA.stdBuilder()
                .itemInputs(NETHER_QUARTZ_PURE)
                .itemOutputs(QUARTZ_FIBER_OUTPUT)
                .duration(5 * SECONDS).eut(16).addTo(wiremillRecipes);

        final ItemStack ME_GLASS_CABLE_OUTPUT = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 2, 16, missing);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        FLUIX_CRYSTAL_DUST,
                        QUARTZ_FIBER)
                .itemOutputs(ME_GLASS_CABLE_OUTPUT)
                .duration(2 * SECONDS + 10 * TICKS).eut(16).addTo(alloySmelterRecipes);

        addShapedRecipe(
                ME_SMART_CABLE,
                ME_GLASS_CABLE, DUST_REDSTONE, null,
                DUST_GLOWSTONE, null, null,
                null, null, null);

        addShapedRecipe(
                ME_SMART_CABLE_DENSE,
                ME_SMART_CABLE, ME_SMART_CABLE, null,
                ME_SMART_CABLE, ME_SMART_CABLE, null,
                null, null, null);

        addShapedRecipe(
                ME_LEVEL_EMITTER,
                TORCH_REDSTONE, PLATE_ALUMINIUM, null,
                PROCESSOR_CALCULATION, STICK_STAINLESSSTEEL, null,
                null, null, null);

        addShapedRecipe(
                ME_LEVEL_EMITTER_FLUID,
                TORCH_REDSTONE, PLATE_LAPIS, null,
                PROCESSOR_CALCULATION, STICK_STAINLESSSTEEL, null,
                null, null, null);

        addShapedRecipe(
                ME_STORAGE_MONITOR,
                ILLUMINATED_PANEL, ME_LEVEL_EMITTER, null,
                null, null, null,
                null, null, null);

        addShapedRecipe(
                ME_STORAGE_MONITOR_FLUID,
                ILLUMINATED_PANEL, ME_LEVEL_EMITTER_FLUID, null,
                null, null, null,
                null, null, null);

        addShapedRecipe(
                ME_TOGGLE_BUS,
                null, DUST_REDSTONE, null,
                ME_GLASS_CABLE, LEVER, ME_GLASS_CABLE,
                null, DUST_REDSTONE, null);
        addShapelessRecipe(
                ME_TOGGLE_BUS,
                ME_TOGGLE_BUS_INVERTED);

        addShapelessRecipe(
                ME_TOGGLE_BUS_INVERTED,
                ME_TOGGLE_BUS);

        addShapedRecipe(
                ILLUMINATED_PANEL,
                null, null, null,
                BLOCK_QUARTZ_GLASS, BLOCK_QUARTZ_GLASS, BLOCK_QUARTZ_GLASS,
                FLUIX_CRYSTAL, FLUIX_CRYSTAL, FLUIX_CRYSTAL);
        addShapedRecipe(
                ILLUMINATED_PANEL,
                null, null, null,
                BLOCK_QUARTZ_GLASS, BLOCK_QUARTZ_GLASS, BLOCK_QUARTZ_GLASS,
                FLUIX_CRYSTAL_PURE, FLUIX_CRYSTAL_PURE, FLUIX_CRYSTAL_PURE);

        addShapedRecipe(
                ME_TERMINAL,
                ILLUMINATED_PANEL, CIRCUIT_LV, null,
                null, null, null,
                null, null, null);

        addShapedRecipe(
                ME_TERMINAL_FLUID,
                ME_TERMINAL, PLATE_LAPIS, null,
                PROCESSOR_LOGIC, null, null,
                null, null, null);

        addShapedRecipe(
                ME_TERMINAL_CRAFTING,
                ME_TERMINAL, CRAFTING_TABLE, null,
                PROCESSOR_CALCULATION, null, null,
                null, null, null);

        addShapedRecipe(
                ME_TERMINAL_INTERFACE,
                ME_TERMINAL, PROCESSOR_ENGINEERING, null,
                ME_INTERFACE, null, null,
                null, null, null);

        addShapedRecipe(
                ME_TERMINAL_PATTERN,
                ME_TERMINAL, PROCESSOR_ENGINEERING, null,
                BLANK_PATTERN, null, null,
                null, null, null);

        addShapedRecipe(
                ME_TERMINAL_PATTERN_FLUID,
                ME_TERMINAL_PATTERN, PLATE_LAPIS, null,
                PROCESSOR_LOGIC, null, null,
                null, null, null);

        addShapedRecipe(
                ME_TERMINAL_PROCESSING,
                ME_TERMINAL_PATTERN, CIRCUIT_EV, null,
                BLANK_PATTERN, null, null,
                null, null, null);

        addShapedRecipe(
                ME_TERMINAL_PROCESSING_FLUID,
                ME_TERMINAL_PATTERN_FLUID, CIRCUIT_EV, null,
                BLANK_PATTERN, null, null,
                null, null, null);

        addShapedRecipe(
                ME_TERMINAL_LEVEL,
                ME_TERMINAL, ME_LEVEL_EMITTER, null,
                ME_LEVEL_EMITTER_FLUID, null, null,
                null, null, null);

        final ItemStack BLANK_PATTERN_OUTPUT = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 8, 52);
        addShapedRecipe(
                BLANK_PATTERN_OUTPUT,
                FINE_WIRE_SILVER, FINE_WIRE_SILVER, FINE_WIRE_SILVER,
                PLATE_PLASTIC, CIRCUIT_HV, PLATE_PLASTIC,
                PLATE_PLASTIC, PLATE_PLASTIC, PLATE_PLASTIC);

        final ItemStack BLOCK_QUARTZ_GLASS_OUTPUT = getModItem(AppliedEnergistics2.ID, "tile.BlockQuartzGlass", 2, 0);
        final ItemStack BLOCK_GLASS_INPUT = getModItem(Minecraft.ID, "glass", 1, 0, missing);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        BLOCK_GLASS_INPUT,
                        DUST_CERTUSQUARTZ)
                .itemOutputs(BLOCK_QUARTZ_GLASS_OUTPUT)
                .duration(5 * SECONDS).eut(16).addTo(alloySmelterRecipes);

        addShapedRecipe(
                CRAFTING_UNIT,
                PLATE_ALUMINIUM, PROCESSOR_CALCULATION, PLATE_ALUMINIUM,
                ME_GLASS_CABLE, PROCESSOR_LOGIC, ME_GLASS_CABLE,
                PLATE_ALUMINIUM, PROCESSOR_CALCULATION, PLATE_ALUMINIUM);

        addShapelessRecipe(CRAFTING_STORAGE_1, CRAFTING_UNIT, ITEM_COMPONENT_1);

        addShapelessRecipe(CRAFTING_STORAGE_4, CRAFTING_UNIT, ITEM_COMPONENT_4);

        addShapelessRecipe(CRAFTING_STORAGE_16, CRAFTING_UNIT, ITEM_COMPONENT_16);

        addShapelessRecipe(CRAFTING_STORAGE_64, CRAFTING_UNIT, ITEM_COMPONENT_64);

        addShapelessRecipe(CRAFTING_CO_PROCESSING, CRAFTING_UNIT, PROCESSOR_ENGINEERING);

        addShapelessRecipe(CRAFTING_MONITOR, CRAFTING_UNIT, ME_STORAGE_MONITOR);

        addShapedRecipe(P2P_TUNNEL,
                null, PLATE_ALUMINIUM, null,
                PLATE_ALUMINIUM, PROCESSOR_ENGINEERING, PLATE_ALUMINIUM,
                FLUIX_CRYSTAL, FLUIX_CRYSTAL, FLUIX_CRYSTAL);
        addShapedRecipe(P2P_TUNNEL,
                null, PLATE_ALUMINIUM, null,
                PLATE_ALUMINIUM, PROCESSOR_ENGINEERING, PLATE_ALUMINIUM,
                FLUIX_CRYSTAL_PURE, FLUIX_CRYSTAL_PURE, FLUIX_CRYSTAL_PURE);

        addShapedRecipe(STORAGE_HOUSING,
                FINE_WIRE_REDALLOY, PLATE_ELECTRICALSTEEL, FINE_WIRE_REDALLOY,
                PLATE_ELECTRICALSTEEL, null, PLATE_ELECTRICALSTEEL,
                FINE_WIRE_REDALLOY, PLATE_ELECTRICALSTEEL, FINE_WIRE_REDALLOY);

        addShapedRecipe(VIEW_CELL,
                BLOCK_QUARTZ_GLASS, DUST_REDSTONE, BLOCK_QUARTZ_GLASS,
                DUST_REDSTONE, CERTUS_QUARTZ, DUST_REDSTONE,
                INGOT_IRON, INGOT_IRON, INGOT_IRON);

        addShapedRecipe(FLUIX_PEARL,
                FLUIX_CRYSTAL_DUST, FLUIX_CRYSTAL, FLUIX_CRYSTAL_DUST,
                FLUIX_CRYSTAL, PLATE_PULSATINGIRON, FLUIX_CRYSTAL,
                FLUIX_CRYSTAL_DUST, FLUIX_CRYSTAL, FLUIX_CRYSTAL_DUST);
        addShapedRecipe(FLUIX_PEARL,
                FLUIX_CRYSTAL_DUST, FLUIX_CRYSTAL_PURE, FLUIX_CRYSTAL_DUST,
                FLUIX_CRYSTAL_PURE, PLATE_PULSATINGIRON, FLUIX_CRYSTAL_PURE,
                FLUIX_CRYSTAL_DUST, FLUIX_CRYSTAL_PURE, FLUIX_CRYSTAL_DUST);

        addShapedRecipe(WIRELESS_RECEIVER,
                null, EMITTER_EV, null,
                PLATE_TITANIUM, FLUIX_PEARL, PLATE_TITANIUM,
                null, PLATE_TITANIUM, null);

        addShapedRecipe(WIRELESS_ACCESS_POINT,
                null, WIRELESS_RECEIVER, null,
                null, PROCESSOR_CALCULATION, null,
                null, ME_GLASS_CABLE, null);

        addShapedRecipe(INFINITY_BOOSTER_CARD,
                QUANTUM_EYE, null, QUANTUM_EYE,
                null, WIRELESS_RECEIVER, null,
                null, null, null);

        addShapedRecipe(WIRELESS_TERMINAL,
                null, WIRELESS_RECEIVER, null,
                null, ME_TERMINAL, null,
                null, ENERGY_CELL_DENSE, null);

        addShapedRecipe(WIRELESS_TERMINAL_CRAFTING,
                WIRELESS_TERMINAL, FLUIX_PEARL, null,
                ME_TERMINAL_CRAFTING, null, null,
                null, null, null);

        addShapedRecipe(PORTABLE_CELL,
                null, null, null,
                ME_CHEST, ITEM_COMPONENT_1, ENERGY_CELL,
                null, null, null);

        addShapedRecipe(PORTABLE_CELL_FLUID,
                null, null, null,
                ME_CHEST, FLUID_COMPONENT_1, ENERGY_CELL,
                null, null, null);

        addShapedRecipe(ME_SECURITY_TERMINAL,
                INGOT_IRON, ME_CHEST, INGOT_IRON,
                ME_GLASS_CABLE, ITEM_COMPONENT_16, ME_GLASS_CABLE,
                INGOT_IRON, PROCESSOR_ENGINEERING, INGOT_IRON);

        addShapedRecipe(PATTERN_ENCODER,
                PLATE_STAINLESSSTEEL, ME_TERMINAL_PATTERN, PLATE_STAINLESSSTEEL,
                CORE_ANNIHILATION, MACHINE_HULL_HV, CORE_FORMATION,
                PLATE_STAINLESSSTEEL, CIRCUIT_HV, PLATE_STAINLESSSTEEL);

        addShapedRecipe(MATTER_CONDENSER,
                PLATE_TITANIUM, PLATE_TITANIUM, PLATE_TITANIUM,
                PLATE_TITANIUM, MACHINE_HULL_EV, PLATE_TITANIUM,
                PLATE_TITANIUM, PLATE_TITANIUM, PLATE_TITANIUM);

        addShapedRecipe(ME_QUANTUM_RING,
                PLATE_STAINLESSSTEEL, PROCESSOR_CALCULATION, PLATE_STAINLESSSTEEL,
                PROCESSOR_ENGINEERING, MACHINE_HULL_EV, PROCESSOR_ENGINEERING,
                PLATE_STAINLESSSTEEL, PROCESSOR_CALCULATION, PLATE_STAINLESSSTEEL);

        addShapedRecipe(ITEM_FILTER,
                null, PAPER, null,
                PAPER, HOPPER, PAPER,
                null, PAPER, null);

        addShapedRecipe(YETA_WRENCH,
                PLATE_IRON, null, PLATE_IRON,
                null, GEARGT_IRON, null,
                null, PLATE_IRON, null);

        final ItemStack BINDER_COMPOSITE_OUTPUT = getModItem(EnderIO.ID, "itemMaterial", 8, 2);
        addShapedRecipe(BINDER_COMPOSITE_OUTPUT,
                GRAVEL, CLAY, GRAVEL,
                BLOCK_SAND, GRAVEL, BLOCK_SAND,
                GRAVEL, CLAY, GRAVEL);

        final ItemStack CONDUIT_BINDER_OUTPUT = getModItem(EnderIO.ID, "itemMaterial", 2, 1);
        GTModHandler.addSmeltingRecipe(
                BINDER_COMPOSITE,
                CONDUIT_BINDER_OUTPUT);

        final ItemStack INGOT_IRON_INPUT = GTOreDictUnificator.get(OrePrefixes.ingot, Materials.Iron, 1L);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        INGOT_IRON_INPUT,
                        DUST_MALACHITE)
                .itemOutputs(INGOT_PULSATINGIRON)
                .duration(7 * SECONDS + 10 * TICKS).eut(16).addTo(alloySmelterRecipes);

        final ItemStack CONDUIT_ITEM_OUTPUT_CRAFT = getModItem(EnderIO.ID, "itemItemConduit", 4, 0);
        addShapedRecipe(CONDUIT_ITEM_OUTPUT_CRAFT,
                CONDUIT_BINDER, CONDUIT_BINDER, CONDUIT_BINDER,
                NUGGET_PULSATINGIRON, NUGGET_PULSATINGIRON, NUGGET_PULSATINGIRON,
                CONDUIT_BINDER, CONDUIT_BINDER, CONDUIT_BINDER);
        final ItemStack CONDUIT_ITEM_OUTPUT_ASSEMBLER = getModItem(EnderIO.ID, "itemItemConduit", 8, 0);
        final ItemStack CONDUIT_BINDER_INPUT = getModItem(EnderIO.ID, "itemMaterial", 6, 1, missing);
        final ItemStack NUGGET_PULSATINGIRON_INPUT = GTOreDictUnificator.get(OrePrefixes.nugget, Materials.PulsatingIron, 3L);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        CONDUIT_BINDER_INPUT,
                        NUGGET_PULSATINGIRON_INPUT)
                .itemOutputs(CONDUIT_ITEM_OUTPUT_ASSEMBLER)
                .duration(4 * SECONDS).eut(16).addTo(assemblerRecipes);

        final ItemStack CONDUIT_ME_OUTPUT_CRAFT = getModItem(EnderIO.ID, "itemMEConduit", 4, 0);
        addShapedRecipe(CONDUIT_ME_OUTPUT_CRAFT,
                CONDUIT_BINDER, CONDUIT_BINDER, CONDUIT_BINDER,
                ME_GLASS_CABLE, ME_GLASS_CABLE, ME_GLASS_CABLE,
                CONDUIT_BINDER, CONDUIT_BINDER, CONDUIT_BINDER);
        final ItemStack CONDUIT_ME_OUTPUT_ASSEMBLER = getModItem(EnderIO.ID, "itemMEConduit", 8, 0);
        final ItemStack ME_GLASS_CABLE_INPUT = getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 3, 16, missing);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        CONDUIT_BINDER_INPUT,
                        ME_GLASS_CABLE_INPUT)
                .itemOutputs(CONDUIT_ME_OUTPUT_ASSEMBLER)
                .duration(4 * SECONDS).eut(16).addTo(assemblerRecipes);

        final ItemStack CONDUIT_FLUID_ENDER_OUTPUT_CRAFT = getModItem(EnderIO.ID, "itemLiquidConduit", 4, 2);
        addShapedRecipe(CONDUIT_FLUID_ENDER_OUTPUT_CRAFT,
                CONDUIT_BINDER, CONDUIT_BINDER, CONDUIT_BINDER,
                BLOCK_GLASS, BLOCK_GLASS, BLOCK_GLASS,
                CONDUIT_BINDER, CONDUIT_BINDER, CONDUIT_BINDER);
        final ItemStack CONDUIT_FLUID_ENDER_OUTPUT_ASSEMBLER = getModItem(EnderIO.ID, "itemLiquidConduit", 8, 2);
        final ItemStack BLOCK_GLASS_INPUT_2 = getModItem(Minecraft.ID, "glass", 3, 0, missing);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        CONDUIT_BINDER_INPUT,
                        BLOCK_GLASS_INPUT_2)
                .itemOutputs(CONDUIT_FLUID_ENDER_OUTPUT_ASSEMBLER)
                .duration(4 * SECONDS).eut(16).addTo(assemblerRecipes);

        final ItemStack RESERVOIR_OUTPUT = getModItem(EnderIO.ID, "blockReservoir", 4, 0);
        addShapedRecipe(RESERVOIR_OUTPUT,
                BLOCK_GLASS, BLOCK_GLASS, BLOCK_GLASS,
                BLOCK_GLASS, CAULDRON, BLOCK_GLASS,
                BLOCK_GLASS, BLOCK_GLASS, BLOCK_GLASS);

        addShapedRecipe(ENDER_CHEST,
                STICK_COPPER, WOOL, STICK_COPPER,
                BLOCK_OBSIDIAN, CHEST_GOLD, BLOCK_OBSIDIAN,
                STICK_COPPER, PLATE_PULSATINGIRON, STICK_COPPER);

        addShapedRecipe(ENDER_TANK,
                STICK_COPPER, WOOL, STICK_COPPER,
                BLOCK_OBSIDIAN, TANK_GOLD, BLOCK_OBSIDIAN,
                STICK_COPPER, PLATE_PULSATINGIRON, STICK_COPPER);

        addShapedRecipe(HOPPER,
                PLATE_IRON, GT_WRENCH, PLATE_IRON,
                PLATE_IRON, CHEST_WOODEN, PLATE_IRON,
                null, PLATE_IRON, null);

        final ItemStack ENDER_PEARL_OUTPUT = getModItem(Minecraft.ID, "ender_pearl", 10, 0);
        final ItemStack DUST_POTASSIUM_INPUT = GTOreDictUnificator.get(OrePrefixes.dust, Materials.Potassium, 4L);
        final FluidStack FLUID_NITROGEN_INPUT = FluidRegistry.getFluidStack("nitrogen", 5000);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        DUST_BERYLLIUM,
                        DUST_POTASSIUM_INPUT)
                .fluidInputs(FLUID_NITROGEN_INPUT)
                .itemOutputs(ENDER_PEARL_OUTPUT)
                .duration(20 * SECONDS).eut(120).addTo(chemicalReactorRecipes);

        final ItemStack DUST_SULFUR_INPUT = GTOreDictUnificator.get(OrePrefixes.dust, Materials.Sulfur, 4L);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        ENDER_PEARL,
                        DUST_SULFUR_INPUT)
                .itemOutputs(ENDER_EYE)
                .duration(10 * SECONDS).eut(480).addTo(chemicalReactorRecipes);

        final ItemStack DUST_GOLD_INPUT = GTOreDictUnificator.get(OrePrefixes.dust, Materials.Gold, 16L);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        DUST_GOLD_INPUT,
                        GEMFLAWLESS_EMERALD)
                .itemOutputs(NETHER_STAR)
                .duration(45 * SECONDS).eut(256).addTo(assemblerRecipes);

        addShapedRecipe(BREWING_STAND,
                null, SPRING_COPPER, null,
                COBBLESTONE, COBBLESTONE, COBBLESTONE,
                null, null, null);

        addShapedRecipe(DENSE_REDCRYSTAL,
                null, TORCH_REDSTONE, null,
                null, COMPARATOR, null,
                null, null, null);

        GTValues.RA.stdBuilder()
                .itemInputs(
                        SUGAR_CANE,
                        STICKY_RESIN)
                .itemOutputs(STICKREED)
                .duration(20 * SECONDS).eut(120).addTo(chemicalReactorRecipes);
    }
}
