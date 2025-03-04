/* prettier-ignore-start */

/* eslint-disable */

// @ts-nocheck

// noinspection JSUnusedGlobalSymbols

// This file is auto-generated by TanStack Router

// Import Routes

import { Route as rootRoute } from "./routes/__root";
import { Route as AppRoutesImport } from "./routes/AppRoutes";

// Create/Update Routes

const AppRoutesRoute = AppRoutesImport.update({
  path: "/AppRoutes",
  getParentRoute: () => rootRoute,
} as any);

// Populate the FileRoutesByPath interface

declare module "@tanstack/react-router" {
  interface FileRoutesByPath {
    "/AppRoutes": {
      preLoaderRoute: typeof AppRoutesImport;
      parentRoute: typeof rootRoute;
    };
  }
}

// Create and export the route tree

export const routeTree = rootRoute.addChildren([AppRoutesRoute]);

/* prettier-ignore-end */
