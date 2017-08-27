package patterns.oreilly.observer.self_implemented.concrete_observers;

import patterns.oreilly.observer.self_implemented.subject.Subject;
import patterns.oreilly.observer.self_implemented.model.WeatherModel;

public interface Observer {
    void update(WeatherModel weatherModel);
    void setSubject(Subject subject);
    void startObserving();
    void stopObserving();
}
