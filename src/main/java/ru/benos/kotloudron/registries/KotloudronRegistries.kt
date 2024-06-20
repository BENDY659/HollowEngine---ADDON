package ru.benos.kotloudron.registries

import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import ru.benos.kotloudron.Kotloudron.Companion.MODID
import ru.benos.kotloudron.registries.blocks.BlockKotloudron
import ru.benos.kotloudron.registries.items.ItemKotloudron
import ru.benos.kotloudron.registries.items.ItemKotloudroniumKatana
import ru.benos.kotloudron.utils.DesingLogging.desingLogging
import thedarkcolour.kotlinforforge.forge.MOD_BUS

object KotloudronRegistries {
  val ITEMS = DeferredRegister.create(
    ForgeRegistries.ITEMS,
    MODID
  )

  val BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    MODID
  )

  val kotloudronItem = ITEMS.register("kotloudron", ::ItemKotloudron)
  val kotloudronium_katana = ITEMS.register("kotloudronium_katana", ::ItemKotloudroniumKatana)

  val kotloudronBlock = BLOCKS.register("kotloudron", ::BlockKotloudron)

  fun init() {
    ITEMS.register(MOD_BUS)
    BLOCKS.register(MOD_BUS)

    desingLogging("REGISTRIES FINISH. REGISTERED: $ITEMS, $BLOCKS")
  }
}