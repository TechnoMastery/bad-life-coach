package fr.benny.badlifecoach;

import fr.benny.badlifecoach.troll.BadlifecoachAdviseTroll;
import net.minheur.potoflux.actionRuns.regs.ActionRun;
import net.minheur.potoflux.loader.mod.events.RegisterRunsEvent;
import net.minheur.potoflux.registry.RegistryList;
import net.minheur.potoflux.utils.ressourcelocation.ResourceLocation;

public class ActionRuns {
    private final RegistryList<ActionRun> LIST_START_LOGIC = new RegistryList<>();
    private static boolean hasGenerated = false;

    public static ActionRuns INSTANCE;

    private ActionRuns() {
        if (hasGenerated) throw new IllegalStateException("Can't create the registry 2 times !");
        hasGenerated = true;
    }

    // def action runs
    public final ActionRun FILL_ADVISES = LIST_START_LOGIC.add(new ActionRun(new ResourceLocation(BadLifeCoach.MOD_ID, "fill_advises"), BadlifecoachAdviseTroll::load));


    public static void register(RegisterRunsEvent event) {
        INSTANCE = new ActionRuns();

        INSTANCE.LIST_START_LOGIC.register(event.startLogicReg);
    }
}
